package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Inserted producer {} in the database, rows affected {}", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%s');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Deleted producer {} in the database, rows affected {}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            throw new RuntimeException(e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d')".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("updated producer {}, rows affected {}", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        String sql = "SELECT id, name FROM anime_store.producer";
        List<Producer> producersList = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                Producer build = Producer.builder().id(id).name(name).build();
//                producersList.add(build);
//                OU
                Producer build = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producersList.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while finding producers", e);
            throw new RuntimeException(e);
        }
        return producersList;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding all Producers");
        String sql = "SELECT id, name FROM anime_store.producer where name like '%%%s%%'"
                .formatted(name);
        List<Producer> producersList = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                Producer build = Producer.builder().id(id).name(name).build();
//                producersList.add(build);
//                OU
                Producer build = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producersList.add(build);
            }
        } catch (SQLException e) {
            log.error("Error while finding producers", e);
            throw new RuntimeException(e);
        }
        return producersList;
    }
}

