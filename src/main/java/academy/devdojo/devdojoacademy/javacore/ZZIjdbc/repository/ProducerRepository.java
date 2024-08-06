package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()){
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
