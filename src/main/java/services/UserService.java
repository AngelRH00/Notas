package services;

import models.User;

import java.util.List;

public class UserService {
    List<User> getAll();
    boolean addUser(String mail, String pass);
}
