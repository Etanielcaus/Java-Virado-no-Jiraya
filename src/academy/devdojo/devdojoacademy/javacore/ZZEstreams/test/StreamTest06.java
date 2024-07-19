package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> novels = new ArrayList<LightNovel>(List.of(
            new LightNovel("gfxg", 120),new LightNovel("guy", 210),
            new LightNovel("asd", 580),new LightNovel("vxcvsd", 300),
            new LightNovel("ascxcvxcv", 3600), new LightNovel("awfwef", 200),
            new LightNovel("awfwef", 500)
    ));
    public static void main(String[] args) {
//        Ex: Tem itens na lista com preço maior que 500?
        boolean b = novels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 500);
        System.out.println(b);

//        Ex: Todos os itens na lista é maior que 500?
        boolean b2 = novels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 500);
        System.out.println(b2);

//        Ex: Não tem nenhum maior que este valor.
        boolean b3 = novels.stream().noneMatch(lightNovel -> lightNovel.getPrice() < 0);
        System.out.println(b3);

        novels.stream().filter(lightNovel -> lightNovel.getPrice()>500)
                .findAny() // Return: Optional --> Ele obriga a tratar o erro
                .ifPresent(System.out::println);

        novels.stream().filter(lightNovel -> lightNovel.getPrice()>=500)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst() // findFirst retorna o primeiro valor que encontrar
                .ifPresent(System.out::println);
    }
}
