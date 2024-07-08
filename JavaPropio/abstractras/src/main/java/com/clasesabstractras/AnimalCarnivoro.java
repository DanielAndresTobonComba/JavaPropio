package com.clasesabstractras;

public class AnimalCarnivoro extends Animal {


    // HEREDO DE LA CLASE ANIMAL QUE ES ABSTRACTA Y ME TRAIGO EL METODO ALIMENTARSE , COMO ESTA CLASE ES DE ANIMALCARNIVORO YA SE COMO USAR EL METODO ALIMENTARSE Y LO IMPLEMENTO ACA CON EL OVERRIDE PARA DECIR QUE ESTOY USANDO LA CLASE ALIMENTARSE.
    @Override
    public void alimentarse (){
        System.out.println("Animal carnivoro se alimenta de carne");
    }

}
