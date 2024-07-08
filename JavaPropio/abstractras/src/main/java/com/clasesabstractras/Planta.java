package com.clasesabstractras;
 
public class Planta extends Servivo {



    @Override // Se usa para decirle a java que estoy sobreescribiendo e metodo de Servivo alimentarse
    public void alimentarse (){
        System.out.println("La platan se alimenta del sol");
    }

}
