package com.polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Relacion de tipo herencia , es un objeto de la superclase que puede almacenar cualquier objeto de su superclase
        // La superclase es compatible con los tipos que derivan de ella pero no alrevez 

        Vehiculo misVehiculos [] = new Vehiculo[3];


        misVehiculos[0] = new Vehiculo("ff", "2020", "Kia");
        misVehiculos[1] = new VehiculoTurismo("xd", "2002", "Ferrari", 4);
        misVehiculos[2] = new VehiculoDeportivo("fer", "2023", "Mazda", 500);

        for (Vehiculo vehiculos : misVehiculos){

           System.out.println(vehiculos.mostrarDatos()); 
           System.out.println("\n");
        }
        
        
    }
}