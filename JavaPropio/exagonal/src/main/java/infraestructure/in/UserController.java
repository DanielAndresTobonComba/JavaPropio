package infraestructure.in;
import application.CreateUserUseCase;
import application.DeleteUserUseCase;
import domain.entity.User;
import java.util.Scanner;

public class UserController {

    private CreateUserUseCase createUserUseCase; 
    private DeleteUserUseCase deleteUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    public UserController(DeleteUserUseCase deleteUserUseCase) {
        this.deleteUserUseCase = deleteUserUseCase;
    }




    public void createUser () {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter user name: ");
            String name = scanner.nextLine();

            System.out.println("Enter user email: ");
            String email = scanner.nextLine();

            User user = new User();
            user.setName(name);
            user.setEmail(email);
            
            // Aqui accedo a la clase CreateUserUseCase
            createUserUseCase.executeCreateUser(user);
            
        }

        System.out.println("User created succesfuly");
    }

    public void deleteUser () {

        try(Scanner scanner = new Scanner(System.in)) {

            long id ;
            
            System.out.println("Digite el codigo del usuario para eliminar");
            id = scanner.nextInt();

            deleteUserUseCase.executeDeleteUser(id);
                
        }

        System.out.println("User deleted succesfuly");


    } 

}
