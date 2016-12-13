<?php

namespace AceBundle\Controller;

use AceBundle\Entity\Disciplina;
use AceBundle\Form\DisciplinaType;
use AceBundle\Repository\DisciplinaRepository;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Method;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Symfony\Component\Form\Extension\Core\Type\HiddenType;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\Routing\Annotation\Route;

/**
 * Disciplinas controller.
 *
 * @Route("/disciplinas")
 */
class DisciplinasController extends Controller
{
    /**
     *
     * @Route("/", name="disciplinas_index")
     * @Method("GET")
     */
    public function indexAction()
    {
        return $this->render('AceBundle:Disciplinas:index.html.twig');
    }

    /**
     *
     * @Route ("/lista/{id}", name="disciplinas_lista")
     * @Method("GET")
     */
    public function listAction ($id)
    {

        /** @var DisciplinaRepository $repository */
        $repository = $this->getDoctrine()->getRepository('AceBundle:Disciplina');

        $title = $repository->getListTitle($id);

        $disciplinas = $repository->findBy(array('listId' => $id));

        return $this->render('AceBundle:Disciplinas:lista.html.twig', array('lista_id' => $id, 'titulo' => $title, 'disciplinas' => $disciplinas));
    }

    /**
     *
     * @Route ("/editar/{id}", name="disciplina_edita")
     * @Method({"GET", "POST"})
     */
    public function editAction (Disciplina $disciplina, Request $request)
    {

        $form = $this->createForm(DisciplinaType::class, $disciplina)->add('save', SubmitType::class, array('label' => 'Salvar'));

        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $mg = $this->getDoctrine()->getManager();
            $mg->persist($disciplina);
            $mg->flush();

            return $this->redirectToRoute('disciplinas_lista', array('id' => $disciplina->getListId()));
        }

        /** @var DisciplinaRepository $repository */
        $repository = $this->getDoctrine()->getRepository('AceBundle:Disciplina');

        $title = $repository->getListTitle($disciplina->getListId());

        return $this->render('AceBundle:Disciplinas:nova.html.twig', array('titulo' => $title, 'form' => $form->createView()));
    }

    /**
     *
     * @Route ("/nova/{lista_id}", name="disciplina_nova")
     * @Method({"GET", "POST"})
     */
    public function novaAction ($lista_id, Request $request)
    {

        $disciplina = new Disciplina();
        $disciplina->setListId($lista_id);

        $form = $this->createForm(DisciplinaType::class, $disciplina)
                    ->add('save', SubmitType::class, array('label' => 'Adicionar'));


        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $mg = $this->getDoctrine()->getManager();
            $mg->persist($disciplina);
            $mg->flush();
            
            return $this->redirectToRoute('disciplinas_lista', array('id' => $lista_id));
        }

        /** @var DisciplinaRepository $repository */
        $repository = $this->getDoctrine()->getRepository('AceBundle:Disciplina');

        $title = $repository->getListTitle($lista_id);

        return $this->render('AceBundle:Disciplinas:nova.html.twig', array('lista_id' => $lista_id, 'titulo' => $title, 'form' => $form->createView()));
    }



    /**
     *
     * @Route ("/delete/{id}", name="disciplina_delete")
     * @Method("POST")
     */
    public function deleteAction (Disciplina $disciplina)
    {
        $mg = $this->getDoctrine()->getManager();
        $mg->remove($disciplina);
        $mg->flush();


        return $this->redirectToRoute('disciplinas_lista', array('id' => $disciplina->getListId()));
    }

}
