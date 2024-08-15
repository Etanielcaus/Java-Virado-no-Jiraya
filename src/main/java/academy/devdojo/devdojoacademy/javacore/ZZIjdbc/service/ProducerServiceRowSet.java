package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.service;

import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.devdojoacademy.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.JdbcRowSet;
import java.util.List;

@Log4j2
public class ProducerServiceRowSet {
    public static List<Producer> findByNameWithJDBCRowSet(String name){
        return ProducerRepositoryRowSet.findByName(name);
    }

    public static void updateProducer(Producer producer){
        ProducerRepositoryRowSet.updateProducer(producer);
    }

    public static void updateCachedProducer(Producer producer){
        ProducerRepositoryRowSet.updateProducerCached(producer);
    }
}
