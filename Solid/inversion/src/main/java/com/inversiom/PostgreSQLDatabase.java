package com.inversiom;

public class PostgreSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Conectado a PostgreSQL Database");
    }

}
