package com.proyecto;

import java.util.Hashtable;

import com.proyecto.Entitty.Equipo;
import com.proyecto.Entitty.Jugador;

public class Controller {
    
    public static Hashtable <Integer, Equipo> controladorEquipos;
    public static Hashtable <Integer , Jugador> controladorJugadores;
    

    private static Controller INSTANCE = new Controller();

    private Controller (){

        //Inicialización de los controladores
        controladorEquipos = new Hashtable<>();
        controladorJugadores = new Hashtable<>();
        


    }

    public static Controller getController()   {
        
        return INSTANCE;
    }

}
