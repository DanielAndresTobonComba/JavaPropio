package com.proyecto;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.proyecto.Entitty.Equipo;
import com.proyecto.Entitty.Jugador;

public class Main {
    public static void main(String[] args) {
        // Creo los objetos
        Equipo equipo = new Equipo();
        Equipo equipo2 = new Equipo();
        Jugador jugador = new Jugador();

        // Inserto los jugadores
        jugador.setEdad(25);
        jugador.setPosicion("GP");
        jugador.setNombre("Daniel Tobon");
        Controller.getController().controladorJugadores.put(1, jugador);


        // Inserto los equipos
        equipo.setNombre("Bucaramanga");
        Controller.getController().controladorEquipos.put(1, equipo);

        equipo2.setNombre("Medellin");
        equipo2.lstJugadores.put(1, jugador); // Inserto el jugador al equipo
        Controller.getController().controladorEquipos.put(2, equipo2);


        // Imprimo lo que hay
        //System.out.println("Equipo: " + equipo.toString());
        //System.out.println("Jugadores: " + jugador.toString());


        // Obtener la llave de cada equipo y guardarla en una lista de tipo Integer
        List<Integer> listaLlavesEquipos = new ArrayList<>(Controller.getController().controladorEquipos.keySet());


        System.out.println("Llaves de los equipos: " + listaLlavesEquipos);

        //Imprimir los datos de cada equipo

        // Como me gusta con un for each

        for (Integer llave : listaLlavesEquipos) {
            Equipo equipoCorrespondiente = Controller.getController().controladorEquipos.get(llave);
            System.out.println("Código del equipo: " + llave);
            System.out.println("Nombre: " + equipoCorrespondiente.getNombre());

            // Iterar sobre las llaves de los jugadores del equipo
            
            Hashtable<Integer, Jugador> jugadores = equipoCorrespondiente.getLstJugadores();

            for (Integer claveJugador : jugadores.keySet()) {
                jugador = jugadores.get(claveJugador);
                System.out.println("Clave del jugador: " + claveJugador);
                System.out.println("Nombre del jugador: " + jugador.getNombre());
                System.out.println("Edad del jugador: " + jugador.getEdad());
                System.out.println("Posición del jugador: " + jugador.getPosicion());
                
            }
        }
    }
        
        // Forma de hacerlo con entry set
/*  for (Integer llave : listaLlavesEquipos) {
            Equipo equipoCorrespondiente = Controller.getController().controladorEquipos.get(llave);
            System.out.println("Código del equipo: " + llave);
            System.out.println("Nombre: " + equipoCorrespondiente.getNombre());

            // Iterar sobre los jugadores del equipo
            Hashtable<Integer, Jugador> jugadores = equipoCorrespondiente.getLstJugadores();

            for (Map.Entry<Integer, Jugador> entry : jugadores.entrySet()) {
                Integer claveJugador = entry.getKey();
                jugador = entry.getValue();
                System.out.println("Clave del jugador: " + claveJugador);
                System.out.println("Nombre del jugador: " + jugador.getNombre());
                System.out.println("Edad del jugador: " + jugador.getEdad());
                System.out.println("Posición del jugador: " + jugador.getPosicion());
            }
        }
 */
}
