package com.inversiom;

public class Main {
    public static void main(String[] args) {
        Database mysqlDatabase = new MySqlDatabase();
        Database postgreDatabase = new PostgreSQLDatabase();

        UserService service = new UserService(mysqlDatabase);
        service.getUser();
    }
}