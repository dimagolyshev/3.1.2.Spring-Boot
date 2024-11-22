package springbootapp.dao;

import springbootapp.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> listUsers();

    User editUser(User user);

    void deleteUser(Long id);
}
