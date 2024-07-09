package com.nuevoabierto;

public class Main {
    public static void main(String[] args) {
        
        Libro libro = new Libro("Porque fracasan los paises", "Daniel Tobon", 2024, 50, "");

        Factura factura = new Factura(libro, 2, 0.1, 0); 



        System.out.println("Precio con impuestos: " + factura.calculaTotal()); 
        

        FacturaImpresion impresion = new FacturaImpresion(factura);

        impresion.imprimir();

        BaseDeDatosPersistencia persistenciaDB = new BaseDeDatosPersistencia();
        persistenciaDB.guardar(factura);

        ArchivoPersistencia persistenciaArchivo = new ArchivoPersistencia(); 
        persistenciaArchivo.guardar(factura);
    }
}