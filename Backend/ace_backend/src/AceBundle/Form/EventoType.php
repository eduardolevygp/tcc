<?php

namespace AceBundle\Form;

use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\Extension\Core\Type\DateType;
use Symfony\Component\Form\Extension\Core\Type\FileType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;
use Symfony\Component\Form\Extension\Core\Type\TimeType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;

class EventoType extends AbstractType
{
    /**
     * @param FormBuilderInterface $builder
     * @param array $options
     */
    public function buildForm(FormBuilderInterface $builder, array $options)
    {
        $builder
            ->add('title', TextType::class, array('label' => 'Título'))
            ->add('date', DateType::class, array('label' => 'Data'))
            ->add('time', TimeType::class, array('label' => 'Hora', 'required' => false))
            ->add('location', TextType::class, array('label' => 'Local', 'required' => false))
            ->add('description', TextareaType::class, array('label' => 'Descrição', 'attr' => array('rows' => 10), 'required' => false))
            ->add('image', FileType::class, array('label' => 'Imagem', 'required' => false, 'attr' => array('accept' => 'image/*')))        ;

    }

    /**
     * @param OptionsResolver $resolver
     */
    public function configureOptions(OptionsResolver $resolver)
    {
        $resolver->setDefaults(array(
            'data_class' => 'AceBundle\Entity\Evento'
        ));
    }
}
