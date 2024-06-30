package com.sobrecarga;

public class Main {
    public static void main(String[] args) {

        // Creacion de las instacias o objetos desde la main sin enviarle los argumentos
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        // Llamada de los metodos sobrecargados enviando los arguemntos
        p1.Correr("14913274921");
        p2.Correr(20, "Daniel");
    }
}