package services;

import models.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<User> getAll() {
        UserDAO ud = new UserDAOJDBCImpl();
        List<User> Users = cd.getAll();
        return Users;
    }

    @Override
    public boolean addUser(String marca, String model, String color, String km, String power) {
        try {
            UserDAO cd = new UserDAOJDBCImpl();
            User User = new User(0, marca, model, color, Integer.parseInt(km), Integer.parseInt(power));
            cd.add(User);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
