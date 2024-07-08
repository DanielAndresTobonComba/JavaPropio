package com.polimorfismo;

public class Vehiculo {

    protected String matricula; 
    protected String modelo; 
    protected String marca;
    public Vehiculo() {
    }

    

    public Vehiculo(String matricula, String modelo, String marca) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }



    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }



    public String mostrarDatos () {

        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo ; 
    }


    
    

}
