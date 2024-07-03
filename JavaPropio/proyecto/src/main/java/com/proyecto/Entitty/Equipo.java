package com.proyecto.Entitty;

import java.util.Hashtable;

public class Equipo {

    public String nombre; 
    public Hashtable<Integer, Jugador> lstJugadores;

    public Equipo() {
        this.lstJugadores = new Hashtable<>();
    }

    public Equipo(String nombre, Hashtable<Integer, Jugador> lstJugadores) {
        this.nombre = nombre;
        this.lstJugadores = lstJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Hashtable<Integer, Jugador> getLstJugadores() {
        return lstJugadores;
    }

    public void setLstJugadores(Hashtable<Integer, Jugador> lstJugadores) {
        this.lstJugadores = lstJugadores;
    }

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", lstJugadores=" + lstJugadores + "]";
    }
}
