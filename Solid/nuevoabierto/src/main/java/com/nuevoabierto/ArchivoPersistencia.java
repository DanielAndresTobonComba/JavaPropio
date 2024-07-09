package com.nuevoabierto;

public class ArchivoPersistencia implements FacturaPersistencia {

    @Override
    public void guardar(Factura factura) {
        // Guardar en archivo
        System.out.println("GUARDANDO EN ARCHIVO\n");
    }

}
