<?php

namespace AceBundle\Controller;

use AceBundle\Entity\Evento;
use AceBundle\Form\EventoType;
use Intervention\Image\Constraint;
use Intervention\Image\Image;
use Intervention\Image\ImageManagerStatic;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Method;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\HttpFoundation\File\UploadedFile;
use Symfony\Component\HttpFoundation\Request;


/**
 * Class EventoController
 * @Route("/evento")
 */
class EventoController extends Controller
{

    /**
     * Lists all Evento entities.
     *
     * @Route("/", name="evento_index")
     * @Method("GET")
     */
    public function indexAction()
    {
        $eventos = $this->getDoctrine()->getRepository('AceBundle:Evento')->findAll();
        return $this->render('AceBundle:Evento:index.html.twig', array('eventos' => $eventos));
    }

    /**
     * Creates a new Evento entity.
     *
     * @Route("/novo", name="evento_novo")
     * @Method({"GET", "POST"})
     */
    public function NovoAction(Request $request)
    {
        $evento = new Evento();

        $form = $this->createForm(EventoType::class, $evento)->add('save', SubmitType::class, array('label' => 'Salvar'));
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            if ($evento->getImage()) {

                /* @var UploadedFile $photo */
                $photo = $evento->getImage();

                $photoname = $this->saveImage($photo);

                $evento->setImage($photoname);
            }

            $mgr = $this->getDoctrine()->getManager();
            $mgr->persist($evento);
            $mgr->flush();

            return $this->redirectToRoute('evento_index');

        }


        return $this->render('AceBundle:Evento:novo.html.twig', array('form' => $form->createView()));
    }


    /**
     * Displays a form to edit an existing Evento entity.
     *
     * @Route("/{id}/edit", name="evento_editar")
     * @Method({"GET", "POST"})
     */
    public function editAction(Request $request, Evento $evento)
    {
        $photo = $evento->getImage();
        $evento->setImage(null);

        $editForm = $this->createForm(EventoType::class, $evento)->add('save', SubmitType::class, array('label' => 'Salvar'));
        $editForm->handleRequest($request);

        if ($editForm->isSubmitted() && $editForm->isValid()) {
            /* @var UploadedFile $uploadedPhoto */
            $uploadedPhoto = $evento->getImage();

            if ($uploadedPhoto) {
                $photoname = $this->saveImage($uploadedPhoto);

                if ($photo) {
                    $oldFile = $this->getParameter('evento_image_folder') . '/' . $photo;
                    if (file_exists($oldFile))
                        unlink($oldFile);
                }

                $evento->setImage($photoname);
            } else {
                $evento->setImage($photo);
            }
            $em = $this->getDoctrine()->getManager();
            $em->persist($evento);
            $em->flush();

            return $this->redirectToRoute('evento_index');
        }

        return $this->render('AceBundle:Evento:editar.html.twig', array(
            'evento' => $evento,
            'photo' => $photo,
            'form' => $editForm->createView()
        ));
    }

    /**
     * Deletes a Evento entity.
     *
     * @Route("/{id}/delete", name="evento_delete")
     * @Method("POST")
     */
    public function deleteAction(Evento $evento)
    {
        if ($evento->getImage()) {
            $oldFile = $this->getParameter('evento_image_folder') . '/' . $evento->getImage();
            if (file_exists($oldFile))
                unlink($oldFile);
        }

        $em = $this->getDoctrine()->getManager();
        $em->remove($evento);
        $em->flush();

        return $this->redirectToRoute('evento_index');
    }

    /**
     * Deletes a Evento image.
     *
     * @Route("/{id}/deleteImage", name="evento_delete_image")
     * @Method("POST")
     */
    public function deleteImageAction(Evento $evento)
    {
        if ($evento->getImage()) {
            $oldFile = $this->getParameter('evento_image_folder') . '/' . $evento->getImage();
            if (file_exists($oldFile))
                unlink($oldFile);
        }

        $evento->setImage(null);

        $em = $this->getDoctrine()->getManager();
        $em->persist($evento);
        $em->flush();

        return $this->redirectToRoute('evento_editar', ['id' => $evento->getId()]);
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

        // proporção 16:10
        $image->fit(640, 400, function ($constraint) {
            /* @var Constraint $constraint */
            // não deixa aumentar de tamanho
            $constraint->upsize();
        });

        $image->save($this->getParameter('evento_image_folder') . '/' . $photoname);

        return $photoname;
    }



}
