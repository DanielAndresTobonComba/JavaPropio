package com.sustitucion;

public class Main {

    static void getAreaTest(Rectangulo r) {

        int ancho = r.getAncho();
        r.setAlto(10);
        System.out.println("Area esperada de " + (ancho * 10) + ", tiene " + r.calcularArea());
     }


    public static void main(String[] args) {
        Rectangulo rc = new Rectangulo(2, 3);
        System.out.println("Retorno de calcular are: " + rc);
        getAreaTest(rc);
  
        Rectangulo sq = new Cuadrado();
        sq.setAncho(5);
        getAreaTest(sq);
        
     }
}