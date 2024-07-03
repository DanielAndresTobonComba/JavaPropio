package com.hastables;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("1", "London");
    capitalCities.put("2", "Berlin");
    capitalCities.put("3", "Oslo");
    capitalCities.put("4", "Washington DC");
    
    System.out.println(capitalCities);

    // Obtener el valor de un hastable especifico
    String existe = capitalCities.get("1");
    System.out.println(existe);
    
    // Recorrer un hastable
    for (String i : capitalCities.keySet()) {
        System.out.println( "llave: " + i + "\nValor: " + capitalCities.get(i) + "\n");

      }
    }
}