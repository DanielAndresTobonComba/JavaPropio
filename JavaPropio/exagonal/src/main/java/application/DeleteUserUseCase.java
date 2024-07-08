package application;

import domain.service.UserService;

public class DeleteUserUseCase {

    private final UserService userService;
    //private final long id;

    public DeleteUserUseCase(UserService userService) {
        this.userService = userService;
        //this.id = id;
    }


    public void executeDeleteUser (long id) {
        userService.deleteUser(id);
    }


}
