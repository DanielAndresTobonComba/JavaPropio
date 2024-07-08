package com.abiertocerrado;

import com.abiertocerrado.Entity.Order;
import com.abiertocerrado.Interface.PaymentMethod;

public class OrderProcessor {

    // Creo los atributos calculator para calcular el total de la orden que me evia la main
    // Creo el paymentMethod que sera de tipo PaymentMethod que me almacenara el tipo de pago que me manda la main

    private OrderCalculator calculator;
    private PaymentMethod paymentMethod;

    public OrderProcessor(OrderCalculator calculator, PaymentMethod
    paymentMethod) {
        this.calculator = calculator;
        this.paymentMethod = paymentMethod;
    }

    // Meotodo recibe la orden
    public void process(Order order) {

        // OrderCalculator calculator = new OrderCalculator(); // Esto es lo mismo que tener el atributo provado la cosa es que lo declaro aca en vez de traerlo desde la main 

        double amount = calculator.calculateTotal(order); // Toma la orden y la manda a la clase calculateTotal que es la que la main me envia
        paymentMethod.pay(amount);
    }

}



