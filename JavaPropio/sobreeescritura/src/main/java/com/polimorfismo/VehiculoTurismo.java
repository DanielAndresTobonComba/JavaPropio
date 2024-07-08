package com.polimorfismo;

public class VehiculoTurismo extends Vehiculo {

    int numPuertas ;

    

    public VehiculoTurismo() {
    }



    public VehiculoTurismo(String matricula, String modelo, String marca, int numPuertas) {
        super(matricula, modelo, marca);
        this.numPuertas = numPuertas;
    }



    public int getNumPuertas() {
        return numPuertas;
    } 

    @Override
    public String mostrarDatos (){
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nPuertas: " + numPuertas ; 

    }
    

    

}
