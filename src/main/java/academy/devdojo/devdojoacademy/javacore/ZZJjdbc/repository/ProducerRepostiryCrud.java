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
import java.util.Optional;

@Log4j2
public class ProducerRepostiryCrud {
    public static List<Producer> findName(String name) {
        log.info("Method for found with name");
        String sql = "SELECT id, name FROM anime_store.producer where name like ?";
        List<Producer> producersList = new ArrayList<>();
        try (Connection conn = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, "%" + name + "%");
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

    public static void deleteNameWithId(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";

        try (Connection connection = ConnectionProducer.getConnection();
             PreparedStatement pr = connection.prepareStatement(sql)) {
            pr.setInt(1, id);
            pr.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";

        try (Connection connection = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, producer.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Optional<Producer> findByIdPreparedStatement(int id) {
        String sql = "SELECT id, name FROM anime_store.producer WHERE id = ?";
        try (Connection connection = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Set the id parameter
            preparedStatement.setInt(1, id);

            // Execute the query
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    // Create and return the Producer object
                    Producer producer = Producer.builder()
                            .id(rs.getInt("id"))
                            .name(rs.getString("name"))
                            .build();
                    return Optional.of(producer);
                } else {
                    log.info("Producer with id '{}' not found", id);
                    return Optional.empty();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updatePrepareStatement(Producer producer) {
        try (Connection connection = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = preparedStatementUpdate(connection, producer)) {
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                log.info("Producer with id '{}' updated successfully", producer.getId());
            } else {
                log.info("Producer with id '{}' not found, no update made", producer.getId());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement preparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }

}
