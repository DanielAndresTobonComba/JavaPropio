package domain.service;

import domain.entity.User;

public interface UserService {

    void createUser (User user);
    void updateUser (User user);
    void deleteUser (long id);
    User findUserById (long id);

}
