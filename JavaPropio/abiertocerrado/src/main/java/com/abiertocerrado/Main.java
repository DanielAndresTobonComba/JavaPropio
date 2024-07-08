package com.abiertocerrado;

import com.abiertocerrado.Entity.Order;
import com.abiertocerrado.Entity.Product;
import com.abiertocerrado.Interface.PaymentMethod;

public class Main {
    public static void main(String[] args) {

        // Creo dos objetos de la clse producto
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 15.0);

        // Cre un objeto de la clase orden y añado los dos productos a la orden 
        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);


        // Creo un objeto de la clase OrderCalculator que me calcula el precio final de una orden
        OrderCalculator calculator = new OrderCalculator();

        //Creo un objeto de paymentMethod que es la interfaz y escojo que tipo de clase que implementa esta interfaz voy a usar , usare la de paypal

        PaymentMethod paymentMethod = new PayPalPayment(); // O podemos usar CreditCardPayment

        // Creo un objeto de ordenProcessor y envio el objeto de calculador para no declararlo mas adelante y  que metodo de pago usare
        OrderProcessor processor = new OrderProcessor(calculator, paymentMethod);
        processor.process(order); // Luego envia al medodo process de la clase OrderProcessor la orden para que calcule el precio total
    }
}