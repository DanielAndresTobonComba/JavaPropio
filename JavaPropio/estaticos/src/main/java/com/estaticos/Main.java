package com.estaticos;

public class Main {

    // Cuando se crea un objeto de una clase se copian todos sus atributos y metodos no estaticos 

    // private static String frase = "Primera frase"; 
    private String frase = "Primera frase";
    

    

    public static void main(String[] args) {
    
        // Cuando es una clase normal se llama creando una instancia de la clase 
    
       Main obj1 = new Main();
       Main obj2 = new Main();
    
       // Cuando yo modifico algun atributo o metodo estatico este cambiara ese atributo en todos los objetos de esa clase creados ya que el atributo le pertenece a la clase y no a cada objeto 
        obj2.frase = "Segunda frase";
        

       System.out.println(obj1.frase); 
       System.out.println(obj2.frase);

       // ESTATICO
       // Pero si es estatico se llama directamente a la clase sin crear una instancia
       //System.out.println(Main.frase); 

        
    }
}