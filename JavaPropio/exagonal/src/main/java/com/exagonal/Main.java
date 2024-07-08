package com.exagonal;

import application.CreateUserUseCase;
import application.DeleteUserUseCase;
import domain.service.UserService;
import infraestructure.in.UserController;
import infraestructure.out.UserRepository;

public class Main {
    public static void main(String[] args) {

/*         // Crear usuario
        UserService userService = new UserRepository();
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(userService);
        UserController consoleAdapter = new UserController(createUserUseCase);

        consoleAdapter.createUser();
 */
        // Traigo la interfaz y escogo que metodo usar
        UserService userService = new UserRepository();

        DeleteUserUseCase deleteUserCase = new DeleteUserUseCase(userService);

        UserController consoleAdapter = new UserController(deleteUserCase);

        consoleAdapter.deleteUser();

    }
}