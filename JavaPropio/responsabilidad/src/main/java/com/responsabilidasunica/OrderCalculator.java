package com.responsabilidasunica;

public class OrderCalculator {

    // Recibo la lst desde payment
    public  double calculateTotal(Order order) {


        double total = 0;

        // Recorro con un for each cada producto de la lista 
        for (Product product : order.getProducts()) {
        total += product.getPrice(); // Obtengo el precio de cada producto y los sumo con el acumulador "total"
        }

        // Retorno ese total
        return total;

    }

}
