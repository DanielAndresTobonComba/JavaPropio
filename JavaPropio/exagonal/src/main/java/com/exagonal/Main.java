package com.exagonal;

import application.CreateUserUseCase;
import application.eliminarUsuario;
import domain.service.UserService;
import infraestructure.in.UserController;
import infraestructure.out.UserRepository;

public class Main {
    public static void main(String[] args) {

/*       // Crear usuario
        UserService userService = new UserRepository();
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(userService);
        UserController consoleAdapter = new UserController(createUserUseCase);

        consoleAdapter.createUser();
 */
        // Traigo la interfaz y creo un objeto de user repository donde tengo todas las clases de la interfaz
        UserService servicio = new UserRepository();

        // Creo un objeto de la clase DeleteUserUseCase en donde recibe el objeto servicio con las clases de la interfaz
        eliminarUsuario deleteUserCase = new eliminarUsuario(servicio);

        UserController consoleAdapter = new UserController(deleteUserCase);

        consoleAdapter.deleteUser();

    }
}