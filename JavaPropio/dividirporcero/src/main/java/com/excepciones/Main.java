package com.excepciones;

public class Main {
    public static void main(String[] args) {

        try {
            
            int resultado = 0;

            int num1 = 0;
            int num2 = 0; 
    
            resultado = num1/num2; 
    
            System.out.println("El resultado es: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error es: " + e);
        }

       

    }
}