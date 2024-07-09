package com.responsabilidadunica;


// Esta factura tiene tres metodos hace tres cosas viola el PRU 



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


// CREO UNA CLASE APARTE PARA IMPRIMIR LA FACTURA QIE ES FACTURAIMPRESION

/* 	public void imprimeFactura() {
            System.out.println(cantidad + "x " + libro.nombre + " " +          libro.precio + "$");
            System.out.println("Tasa de Descuento: " + tasaDescuento);
            System.out.println("Tasa de Impuesto: " + tasaImpuesto);
            System.out.println("Total: " + total);
	} */

// CREO LA CLASE GUARDAR ARCHIVOS Y ME LLEVO ESTE CODIGO
/* 
        public void guardarArchivo(String nombreArchivo) {
	// Crea un archivo con el nombre dado y escribe la factura.
	} */

}
