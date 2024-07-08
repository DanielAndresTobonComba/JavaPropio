package com.abiertocerrado;

import com.abiertocerrado.Interface.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {

    @Override

    public void pay (double amount){

        System.out.println("Paying with credit card" + amount);
    }

    

}
