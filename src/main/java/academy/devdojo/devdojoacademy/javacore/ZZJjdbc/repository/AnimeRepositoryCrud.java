package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.repository;

import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.conn.ConnectionProducer;
import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.dominio.Anime;
import academy.devdojo.devdojoacademy.javacore.ZZJjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Log4j2
public class AnimeRepositoryCrud {
    public static Anime findName(String name) {
        log.info("Searching with name");
        try (Connection connection = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = findByNamePreparedStatement(connection, name);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                return Anime.builder().episodes(resultSet.getInt("episodes"))
                        .id(resultSet.getInt("id")).name(resultSet.getString("name"))
                        .producer(Producer.builder().name(resultSet.getString("name")).build()).build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static PreparedStatement findByNamePreparedStatement(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.anime where name like ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "%");
        return preparedStatement;
    }

    public static void deleteAnime(int id) {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?)";

        try (Connection connection = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void save(Anime anime) {
        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `produce_id`) VALUES (?, ?, ?);";

        try (Connection connection = ConnectionProducer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, anime.getName());
            preparedStatement.setInt(2, anime.getEpisodes());
            preparedStatement.setInt(3, anime.getProducer().getId());


            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
