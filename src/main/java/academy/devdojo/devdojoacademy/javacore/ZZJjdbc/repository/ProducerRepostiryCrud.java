package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.repository;

import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.conn.ConnectionProducer;
import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepostiryCrud {
    public static List<Producer> findName(String name){
        log.info("Method for found with name");
        String sql = "SELECT id, name FROM anime_store.producer where name like ?";
        List<Producer> producersList = new ArrayList<>();
        try (Connection conn = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, "%" +name+ "%");
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    Producer build = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                    producersList.add(build);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producersList;
    }

}
