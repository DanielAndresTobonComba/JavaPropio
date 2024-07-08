package com.responsabilidasunica;

public class Main {
    public static void main(String[] args) {

        // Creo los productos de la clase product
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 15.0);

        // Tomo los dos productos y los inserto en la lista de productos de la clase order
        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        // Creo un objeto de la clase pago y le mando la lista de productos desde la clase order
        Payment payment = new Payment();

        payment.pay(order);
    }
}