package com.sobrecarga;

public class Persona {


    // Atributos 
    
    String nombre; 
    int edad;
    String dni;
    
    // Es necesario el constructor vacio ya que permite la creacion de la instacia de la clase o el objeto sin necesidad de declararle  los atributos desde donde se este creando la instancia
    public Persona() {
    }

    // Sobrecarga de metodos constructores
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public Persona(String dni) {
        this.dni = dni;
    }


    // Sobrecarga de metodos correr , los diferencia por la cantidad y tipos de parametros que le pongamos a los metodos pero no los diferencia por el tipo de retorno osea si tengo dos metodos, que uno retorne y otro no , java no diferenciara entre ellos.

    public void Correr (int edad , String nombre ){
        System.out.println("Soy " + nombre + " tengo " + edad + "años");
    }

    public void Correr (String dni){
        System.err.println("DNI: " + dni);
    }

    

}
