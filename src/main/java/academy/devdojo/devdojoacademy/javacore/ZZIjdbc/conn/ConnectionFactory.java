package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.conn;

import com.mysql.cj.CacheAdapter;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
//    java.sql = Connection, Statement, ResultSet, DriverManager
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/anime_store";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);

    }

    public static JdbcRowSet getConnectionJdbc() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/anime_store";
        String username = "root";
        String password = "root";

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }

    public static CachedRowSet getConnectionCachedRowSet() throws SQLException {
        return RowSetProvider.newFactory().createCachedRowSet();
    }
}
