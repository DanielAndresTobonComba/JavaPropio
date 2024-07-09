package com.nuevoabierto;

public class Factura {

    public Libro libro;
	public int cantidad;
	public double tasaDescuento;
	public double tasaImpuesto;
	public double total;

	public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
		this.libro = libro;
		this.cantidad = cantidad;
		this.tasaDescuento = tasaDescuento;
		this.tasaImpuesto = tasaImpuesto;
		this.total = this.calculaTotal(); // Aqui lo que retorne la operacion calcular total sera el total en la factura
	}

    public double calculaTotal() {
        double precio = libro.precio * cantidad * (1 - tasaDescuento); 
        double precioConImpuestos = precio * (1 + tasaImpuesto); 
        return precioConImpuestos;
    }

}
