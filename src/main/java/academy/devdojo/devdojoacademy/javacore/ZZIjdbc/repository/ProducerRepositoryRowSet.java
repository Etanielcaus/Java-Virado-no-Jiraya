package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByName(String name){
        String sql = "SELECT id, name FROM anime_store.producer where name like ?";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getConnectionJdbc()){
            jrs.setCommand(sql);
            jrs.setString(1, "%" + name + "%");
            jrs.execute();
            while (jrs.next()){
                Producer build = Producer.builder().name(jrs.getString("name")).id(jrs.getInt("id")).build();
                producers.add(build);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }
    public static void updateProducer(Producer producer){
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?)";
        try (JdbcRowSet jrs = ConnectionFactory.getConnectionJdbc()) {
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
