package academy.devdojo.devdojoacademy.javacore.ZZJjdbc.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}
