package com.segregacion;

public class PagoHora extends EstacionamientoPagado {

    // Podria quitar la sobrecarga de metodos y crear metodos en clases aparte heredando el calcular factura y aplicandolo de forma distinta en cada metodo aca el metodo heradado esta sobreescrito y le agrego un parametro
    @Override
    public double calcularTarifa (Coche coche , int horas) {
        return horas * 0 ;
    }

}
