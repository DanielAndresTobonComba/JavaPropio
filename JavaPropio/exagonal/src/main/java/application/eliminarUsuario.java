package application;

import domain.service.UserService;

public class eliminarUsuario {


    // Aqui llegan todos los metodos que estan en UserRepository
    private final UserService userService;
    

    public eliminarUsuario(UserService userService) {
        this.userService = userService;
        
    }

    //  Creo la clase executeDeleteUser que recibira el id del usuario a eliminar y luego ira a deleteUser que es un metodo que esta en la interfaz y tomara la id que le llegue para borrar al usuario especifico

    // Escogo el metodo que necesito que es deleteUser 
    public void executeDeleteUser (long id) {
        userService.deleteUser(id);
    }


}
