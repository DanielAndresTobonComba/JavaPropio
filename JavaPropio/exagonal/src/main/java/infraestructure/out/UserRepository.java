package infraestructure.out;

import domain.entity.User;
import domain.service.UserService;
import infraestructure.config.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository implements UserService {

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection connection = DatabaseConfig.gConnection();
             PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setId(generatedKeys.getLong(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Aquí se debería manejar de forma más adecuada, dependiendo del contexto de tu aplicación
        }
    }

    @Override
    public User findUserById(long id) {
        String sql = "SELECT id, name, email FROM user WHERE id = ?";
        User user = null;

        try (Connection connection = DatabaseConfig.gConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setLong(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    user = new User();
                    user.setId(resultSet.getLong("id"));
                    user.setName(resultSet.getString("name"));
                    user.setEmail(resultSet.getString("email"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Aquí se debería manejar de forma más adecuada, dependiendo del contexto de tu aplicación
        }

        return user;
    }

    @Override
    public void updateUser(User user) {
    }

    @Override

    public void deleteUser(long id) {
        String sql = "DELETE FROM users WHERE id = ?";
    
        try (Connection connection = DatabaseConfig.gConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
    
            statement.setLong(1, id);
            statement.executeUpdate();
    
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al intentar eliminar el usuario con ID: " + id);
            // Aquí se debería manejar de forma más adecuada, dependiendo del contexto de tu aplicación
        }
    }
    


}
