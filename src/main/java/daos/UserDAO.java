package daos;

import models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAll();
    void add(User c);
    void delete(User c);
    User getFromId(int id);
    List<User> getUsersForColorCHANGE(String colorCHANGE);
}
