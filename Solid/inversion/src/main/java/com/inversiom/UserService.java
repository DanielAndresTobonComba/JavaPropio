package com.inversiom;

public class UserService {
    
    private Database database;

    // Inyección de dependencia a través del constructor
    public UserService(Database database) {
        this.database = database;
    }

    public void getUser() {
        database.connect();
        System.out.println("Obteniendo usuario");
    }
}
