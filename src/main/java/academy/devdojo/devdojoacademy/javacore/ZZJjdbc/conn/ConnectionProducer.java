package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProducer {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/anime_store";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
}