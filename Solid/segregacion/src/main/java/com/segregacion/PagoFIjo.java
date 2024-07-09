package com.segregacion;

// Podria quitar la sobrecarga de metodos y crear metodos en clases aparte heredando el calcular factura y aplicandolo de forma distinta en cada metodo
public class PagoFIjo extends EstacionamientoPagado{

    @Override
    public double calcularTarifa (Coche coche){
        System.out.println("Implementando pago fijo");
        return 0;
    }

}
