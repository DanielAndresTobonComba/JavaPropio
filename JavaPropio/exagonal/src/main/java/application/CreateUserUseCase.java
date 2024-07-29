package application;

import domain.entity.User;
import domain.service.UserService;
import infraestructure.out.UserRepository;

public class CreateUserUseCase {
/* 
    private final UserService userService; */


/*     public CreateUserUseCase (UserService userService ) {
        this.userService = userService;
        
    }  */
/* 
    public void executeCreateUser (User user) {
        userService.createUser(user);
    } */


    public void executeCreateUser (User user) {
        UserRepository userRepository = new UserRepository(); 
        userRepository.createUser(user);
    }
}
