package com.clasesabstractras;

public class Main {
    public static void main(String[] args) {
       // Si un metodo es abstracto su clase debe ser abstracta 
       // No se pueden crear objetos de clases abstractas solo se pueden llamar a los hijos que implementan esas clases/*  */
       // Es una superclase o clase padre que va a heredar a las clases hijas


       Planta planta = new Planta();
       planta.alimentarse();

       AnimalCarnivoro animalC = new AnimalCarnivoro(); 
       animalC.alimentarse();


    }
}