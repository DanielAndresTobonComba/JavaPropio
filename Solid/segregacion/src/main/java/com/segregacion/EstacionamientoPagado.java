package com.segregacion;

public class EstacionamientoPagado implements Estacionamiento {

	@Override
	public void aparcarCoche() {
		
	}

	@Override
	public void sacarCoche() {

	}

	@Override
	public void getCapacidad() {

	}


	// Aca hago sobrecarga de metodos para pagar sea por horas o sea por tarifa fija
	
	public double calcularTarifa(Coche coche) {
		return 0;
	}

	public double calcularTarifa (Coche coche , int horas) {
		return horas * 0;
	}
	
	public void hacerPago(Coche coche) {
		
	}
}
