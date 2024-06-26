package com.metodoburbuja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int arreglo [] , nElementos , aux; //Declaro el arreglo
        
        System.out.print("Digite la cantidad de dato a ordenar: ");

        nElementos = entrada.nextInt(); 
        entrada.nextLine(); // Obtengo la cantidad de datos

        arreglo = new int [nElementos]; // Se asigna el limite de datos al arreglo

        for(int i = 0 ; i < nElementos ; i++ ){
            System.out.print((i+1) + " Digite un numero: ");
            arreglo[i] = entrada.nextInt(); 
            entrada.nextLine();
        }


        //Metodo burbuja

        for(int i = 0; i < (nElementos-1); i++){
            for(int j = 0; j <(nElementos-1); j++){
                if(arreglo[j] > arreglo [j+1]){
                    //Si el numero actual > numero siguiente 
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

        //Mostrar datos 
        for(int numero : arreglo){
            System.out.println("- " + numero);
        }

        //Mostrar datos de otra forma 
        for(int i = 0 ; i < arreglo.length; i++){
            System.out.println("- " + arreglo[i]);
        }
    }
}