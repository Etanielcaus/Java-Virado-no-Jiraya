package academy.devdojo.devdojoacademy.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;
    Float salary;
}
