package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
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
        return findByName("");
//        List<Producer> producersList = new ArrayList<>();
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement smt = conn.createStatement();
//             ResultSet rs = smt.executeQuery(sql)) {
//            while (rs.next()) {
////                int id = rs.getInt("id");
////                String name = rs.getString("name");
////                Producer build = Producer.builder().id(id).name(name).build();
////                producersList.add(build);
////                OU
//                Producer build = Producer.builder()
//                        .id(rs.getInt("id"))
//                        .name(rs.getString("name"))
//                        .build();
//                producersList.add(build);
//            }
//        } catch (SQLException e) {
//            log.error("Error while finding producers", e);
//            throw new RuntimeException(e);
//        }
//        return producersList;
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

    public static void showProducerMetaData() {
        log.info("Showing producer metadata");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement();
             ResultSet rs = smt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", metaData.getTableName(i));
                log.info("Column name '{}'", metaData.getColumnName(i));
                log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", metaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while finding producers", e);
            throw new RuntimeException(e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing driver metadata");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            String databaseProductName = metaData.getDatabaseProductName();

            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("{} Supports TYPE_FORWARD_ONLY", databaseProductName);
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("{} Supports TYPE_SCROLL_SENSITIVE", databaseProductName);
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("{} Supports TYPE_SCROLL_INSENSITIVE", databaseProductName);
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while finding producers", e);
            throw new RuntimeException(e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT id, name FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = smt.executeQuery(sql)) {
            log.info("Is on last line {}", rs.last());
            log.info("Row number: {}", rs.getRow());
            log.info(Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build());

            log.info("Is on first line {}", rs.first());
            log.info("Row number: {}", rs.getRow());
            log.info(Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build());

            log.info("Row absolute {}", rs.absolute(5));
            log.info("Row number: {}", rs.getRow());
            log.info(Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addSalary(){
        String sql = "SELECT id, name, salary FROM anime_store.producer";
        try (Connection connection = ConnectionFactory.getConnection();
         Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = stmt.executeQuery(sql)){
            rs.last();
            float salary = rs.getFloat("salary");

            log.info("adding a salary of 500 in the {}", rs.getString("name"));
            rs.updateFloat("salary", salary + 500);
            rs.updateRow();

            float updatedSalary = rs.getFloat("salary");

            log.info("Multiplyng this salary in 10x {}", rs.getFloat("salary"));
            rs.updateFloat("salary", updatedSalary * 10);
            rs.updateRow();

            log.info(Producer.builder()
                    .name(rs.getString("name"))
                    .id(rs.getInt("id"))
                    .salary(rs.getFloat("salary"))
                    .build());

//            Here we do add a salary in all Producers
//            My cursor are in the last Producers, so i are using the previous and add salary in all.
//            This method don't make part of the course, but i'm using for learning more.
//            This will make add the most salary ever if executed.
            while (rs.previous()){
                log.info("adding a salary of 500 in the {}", rs.getString("name"));
                rs.updateFloat("salary", salary + 500);
                rs.updateRow();
            }

            log.info("Row now {}", rs.getRow());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void reduceSalary(){
        String sql = "SELECT id, name, salary FROM anime_store.producer";
        try (Connection connection = ConnectionFactory.getConnection();
        Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                rs.updateFloat("salary", 200);
                rs.updateRow();
                log.info("the salary of '{}' all is now '{}", rs.getString("name")
                , rs.getFloat("salary"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void toUpperCaseAllNames(){
        String sql = "SELECT id, name FROM anime_store.producer;";
        try (Connection connection = ConnectionFactory.getConnection();
        Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = stmt.executeQuery(sql) ){
            while (resultSet.next()){
                String name = resultSet.getString("name");
                resultSet.updateString("name", name.toLowerCase());
                resultSet.updateRow();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Producer> findNameAndToUpperCase(String name){
        String sql = "SELECT id, name FROM anime_store.producer where name like '%%%s%%'".formatted(name);
        List<Producer> producerListAtt = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
        Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer build = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producerListAtt.add(build);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producerListAtt;
    }
}

