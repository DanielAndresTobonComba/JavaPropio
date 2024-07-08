package com.sobrecarga;

public class Calculadora {

    // Los diferencia por la cantidad y tipos de parametros que le pongamos a los metodos pero no los diferencia por el tipo de retorno

    // Aqui creo la clase sumar para enteros

    public int sumar(int a, int b) {
        System.out.println("Entre en enteros");
        return a + b;

    }

    // Aqui creo la clase sumar para double pero ahora me sumara doubles pero es una sobrecarga del primer metodo

    public double sumar(double a, double b) {
        System.out.println("Entre en double");
        return a + b;
    }

}
