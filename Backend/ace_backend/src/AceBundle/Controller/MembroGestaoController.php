<?php

namespace AceBundle\Controller;

use Intervention\Image\Constraint;
use Intervention\Image\Image;
use Intervention\Image\ImageManagerStatic;
use Symfony\Component\Form\Extension\Core\Type\FileType;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\Form\Extension\Core\Type\TextType;
use Symfony\Component\HttpFoundation\File\File;
use Symfony\Component\HttpFoundation\File\UploadedFile;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use AceBundle\Entity\MembroGestao;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;

use Sensio\Bundle\FrameworkExtraBundle\Configuration\Method;

/**
 * MembroGestao controller.
 *
 * @Route("/membrogestao")
 */
class MembroGestaoController extends Controller
{
    /**
     * Lists all MembroGestao entities.
     *
     * @Route("/", name="membrogestao_index")
     * @Method("GET")
     */
    public function indexAction()
    {
        $membros = $this->getDoctrine()->getRepository('AceBundle:MembroGestao')->findAll();
        return $this->render('AceBundle:MembroGestao:index.html.twig', array('membros' => $membros));
    }

    /**
     * Creates a new MembroGestao entity.
     *
     * @Route("/novo", name="membrogestao_novo")
     * @Method({"GET", "POST"})
     */
    public function NovoAction(Request $request)
    {
        $membro = new MembroGestao();

        $form = $this->createFormBuilder($membro)
            ->add('name', TextType::class, array('label' => 'Nome'))
            ->add('image_url', FileType::class, array('label' => 'Foto', 'required' => false, 'attr' => array('accept' => 'image/*')))
            ->add('role', TextType::class, array('label' => 'Cargo', 'required' => false))
            ->add('email', TextType::class, array('label' => 'Email', 'required' => false))
            ->add('phone', TextType::class, array('label' => 'Telefone', 'required' => false))
            ->add('save', SubmitType::class, array('label' => 'Adicionar'))->getForm();

        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            if ($membro->getImageUrl()) {
                /* @var UploadedFile $photo */
                $photo = $membro->getImageUrl();

                $photoname = $this->saveImage($photo);

                $membro->setImageUrl($photoname);
            }

            $mgr = $this->getDoctrine()->getManager();
            $mgr->persist($membro);
            $mgr->flush();

            return $this->redirectToRoute('membrogestao_index');

        }


        return $this->render('AceBundle:MembroGestao:novo.html.twig', array('form' => $form->createView()));
    }

    /**
     * Displays a form to edit an existing MembroGestao entity.
     *
     * @Route("/{id}/edit", name="membrogestao_editar")
     * @Method({"GET", "POST"})
     */
    public function editAction(Request $request, MembroGestao $membroGestao)
    {
        $photo = $membroGestao->getImageUrl();
        $membroGestao->setImageUrl(null);

        $editForm = $this->createFormBuilder($membroGestao)
            ->add('name', TextType::class, array('label' => 'Nome'))
            ->add('image_url', FileType::class, array('label' => 'Foto', 'required' => false, 'attr' => array('accept' => 'image/*')))
            ->add('role', TextType::class, array('label' => 'Cargo', 'required' => false))
            ->add('email', TextType::class, array('label' => 'Email', 'required' => false))
            ->add('phone', TextType::class, array('label' => 'Telefone', 'required' => false))
            ->add('save', SubmitType::class, array('label' => 'Salvar'))->getForm();
        $editForm->handleRequest($request);

        if ($editForm->isSubmitted() && $editForm->isValid()) {
            /* @var UploadedFile $uploadedPhoto */
            $uploadedPhoto = $membroGestao->getImageUrl();

            if ($uploadedPhoto) {
                $photoname = $this->saveImage($uploadedPhoto);

                if ($photo) {
                    $oldFile = $this->getParameter('membro_photo_folder') . '/' . $photo;
                    if (file_exists($oldFile))
                        unlink($oldFile);
                }

                $membroGestao->setImageUrl($photoname);
            } else {
                $membroGestao->setImageUrl($photo);
            }
            $em = $this->getDoctrine()->getManager();
            $em->persist($membroGestao);
            $em->flush();

            return $this->redirectToRoute('membrogestao_index');
        }

        return $this->render('AceBundle:MembroGestao:editar.html.twig', array(
            'membroGestao' => $membroGestao,
            'photo' => $photo,
            'form' => $editForm->createView()
        ));
    }

    /**
     * Deletes a MembroGestao entity.
     *
     * @Route("/{id}/delete", name="membrogestao_delete")
     * @Method("POST")
     */
    public function deleteAction(MembroGestao $membroGestao)
    {
        if ($membroGestao->getImageUrl()) {
            $oldFile = $this->getParameter('membro_photo_folder') . '/' . $membroGestao->getImageUrl();
            if (file_exists($oldFile))
                unlink($oldFile);
        }

        $em = $this->getDoctrine()->getManager();
        $em->remove($membroGestao);
        $em->flush();

        return $this->redirectToRoute('membrogestao_index');
    }

    /**
     * Deletes a MembroGestao photo.
     *
     * @Route("/{id}/deletePhoto", name="membrogestao_delete_photo")
     * @Method("POST")
     */
    public function deletePhotoAction(MembroGestao $membroGestao)
    {
        if ($membroGestao->getImageUrl()) {
            $oldFile = $this->getParameter('membro_photo_folder') . '/' . $membroGestao->getImageUrl();
            if (file_exists($oldFile))
                unlink($oldFile);
        }

        $membroGestao->setImageUrl(null);

        $em = $this->getDoctrine()->getManager();
        $em->persist($membroGestao);
        $em->flush();

        return $this->redirectToRoute('membrogestao_editar', ['id' => $membroGestao->getId()]);
    }

    /**
     * @param $uploadedPhoto
     * @return string
     */
    private function saveImage(UploadedFile $uploadedPhoto)
    {
        if ( strpos($uploadedPhoto->getMimeType(), 'image/') !== 0 ) {
            return null;
        }

        //nome de arquivo
        $photoname = md5(uniqid()) . '.' . $uploadedPhoto->guessExtension();

        //$uploadedPhoto->move($this->getParameter('membro_photo_folder'), $photoname);


        /* @var Image $image */
        $image = ImageManagerStatic::make($uploadedPhoto->getRealPath());

        $image->fit(500, 500, function ($constraint) {
            /* @var Constraint $constraint */
            // não deixa aumentar de tamanho
            $constraint->upsize();
        });

        $image->save($this->getParameter('membro_photo_folder') . '/' . $photoname);

        return $photoname;
    }


}
