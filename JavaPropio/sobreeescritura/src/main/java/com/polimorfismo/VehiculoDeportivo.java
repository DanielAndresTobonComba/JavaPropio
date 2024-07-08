package com.polimorfismo;

public class VehiculoDeportivo extends Vehiculo {

    int cilindrada ;

    public VehiculoDeportivo() {
    }

    

    public VehiculoDeportivo(String matricula, String modelo, String marca, int cilindrada) {
        super(matricula, modelo, marca);
        this.cilindrada = cilindrada;
    }



    @Override
    public String mostrarDatos (){
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindraje: " + cilindrada ; 

    }

}
