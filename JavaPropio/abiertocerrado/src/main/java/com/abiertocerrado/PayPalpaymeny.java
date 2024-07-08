package com.abiertocerrado;

import com.abiertocerrado.Interface.PaymentMethod;

class PayPalPayment implements PaymentMethod {

    @Override
        public void pay(double amount) {
            System.out.println("Paying with PayPal: " + amount);
        }
    
        

    }
