package com.responsabilidasunica;

public class Payment {

    // Recibo la lst de los productos de la orden
    public void pay(Order order) {

        // Creo un objeto de la clase OrderCalculator
        OrderCalculator calcular = new OrderCalculator();


        // Envio la lst a la clase OrderCalculator para que calcule el precio total de la orden
        System.out.println("Paying " + calcular.calculateTotal(order)); // Recibo el valor de retorno con el totoal de la orden y lo imprimo
    }

}
