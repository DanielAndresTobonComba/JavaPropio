package com.proyecto.Entitty;

public class Jugador {

    public String nombre; 
    public int edad; 
    public String posicion;
    
    public Jugador() {
    }

    

    public Jugador(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }



    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + "]";
    }

    

    


}
