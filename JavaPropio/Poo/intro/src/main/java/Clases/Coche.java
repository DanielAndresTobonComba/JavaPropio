package Clases;

public class Coche {

    //Atributos 

    String color; 
    String marca;
    int km;

    public static void main(String[] args) {
        Coche coche1 = new Coche(); // Creamos el objeto

        coche1.color = "Blanco";
        coche1.marca = "Audi"; 
        coche1.km = 10;

        System.out.println("Color: " + coche1.color);
        System.out.println("Marca: " + coche1.marca);
        System.out.println("Kilometraje:  " + coche1.km);
    }

}
