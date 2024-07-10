package com.inversiom;

public class MySqlDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Conectado a MySQL Database");
    }

}
