<?php

namespace AceBundle\Controller;

use AceBundle\Entity\Disciplina;
use AceBundle\Entity\MembroGestao;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Serializer\Encoder\JsonEncoder;
use Symfony\Component\Serializer\Normalizer\ObjectNormalizer;
use Symfony\Component\Serializer\Serializer;


/**
 * Default controller
 *
 * @Route("/api")
 */

class ApiController extends Controller
{

    /**
     * @Route("/membrosGestao", name="membros_gestao")
     */
    public function membrosGestaoAction()
    {
        /* @var MembroGestao[] $membros */
        $membros = $this->getDoctrine()->getRepository('AceBundle:MembroGestao')->findAll();

        return $this->jsonResponse($membros);

    }

    /**
     * @Route("/disciplinas/lista/{id}")
     */
    public function disciplinasListaAction($id)
    {
        $disciplinas = $this->getDoctrine()->getRepository('AceBundle:Disciplina')
                            ->createQueryBuilder('d')
                            ->select('d.id, d.name, d.code')
                            ->where('d.listId = :lista_id')
                            ->setParameter('lista_id', $id)
                            ->getQuery()->getResult();

        return $this->jsonResponse($disciplinas);
    }

    /**
     * @Route("/disciplinas/{id}")
     */
    public function disciplinaAction (Disciplina $disciplina)
    {
        return $this->jsonResponse($disciplina);
    }

    /**
     * @return Response
     */
    private function jsonResponse($obj) {

        /* @var Serializer $serializer */
        $serializer = $this->get('serializer');

        $response = new Response($serializer->serialize($obj, 'json'));
        $response->headers->set('Content-Type', 'application/json');
        return $response;
    }
}
