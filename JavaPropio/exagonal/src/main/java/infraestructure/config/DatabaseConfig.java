package infraestructure.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    // Falta lo del profe en el chat

    private static final String URL = "jdbc:mysql://localhost:3306/sales";

    private static final String USER = "campus2023";

    private static final String PASSWORD = "campus2023";

    public static Connection gConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
