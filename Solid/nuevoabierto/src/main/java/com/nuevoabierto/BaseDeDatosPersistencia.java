package com.nuevoabierto;

public class BaseDeDatosPersistencia implements FacturaPersistencia {

    @Override
    public void guardar(Factura factura) {
        // Guardar en la base de datos
        System.out.println("Guardando en base de datos\n");
    }

}
