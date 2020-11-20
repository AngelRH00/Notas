package daos;

import models.User;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class UserDAOJDBCImpl implements UserDAO{
    @Override
    public List<User> getAll() {
        List<User> result = new ArrayList<>();
        try {
            Connection c = Database.getConnection();
            PreparedStatement ps = c.prepareStatement("select * from User");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String model = rs.getString("model");
                String marca = rs.getString("marca");
                String color = rs.getString("color");
                int km = rs.getInt("km");
                int power = rs.getInt("power");
                User User = new User(id, model, marca, color, km, power);
                result.add(User);
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void add(User c) {
        try {
            Connection conn = Database.getConnection();
            PreparedStatement ps = conn.prepareStatement("insert into User (marca, model, color, km, power) values (?,?,?,?,?)");
            ps.setString(1, c.getMarca());
            ps.setString(2, c.getModel());
            ps.setString(3, c.getColor());
            ps.setInt(4, c.getKm());
            ps.setInt(5, c.getPower());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
