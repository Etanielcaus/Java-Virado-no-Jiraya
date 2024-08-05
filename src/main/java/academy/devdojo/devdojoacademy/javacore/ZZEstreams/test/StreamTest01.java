package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;


import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparatorLightByTitle implements Comparator<LightNovel> {
    @Override
    public int compare(LightNovel o1, LightNovel o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

class comparatorLightByPrice implements Comparator<LightNovel> {
    @Override
    public int compare(LightNovel o1, LightNovel o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class StreamTest01 {
    private static List<LightNovel> novels = new ArrayList<LightNovel>(List.of(
            new LightNovel("gfxg", 120),new LightNovel("guy", 210),
            new LightNovel("asd", 580),new LightNovel("vxcvsd", 300),
            new LightNovel("ascxcvxcv", 3600), new LightNovel("awfwef", 200)
    ));
    public static void main(String[] args) {

//        Collections.sort(novels, new comparatorLightByTitle());
        novels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(novels);


//        Collections.sort(novels, new comparatorLightByPrice());
        novels.sort(Comparator.comparing(LightNovel::getPrice));
        System.out.println(novels);

        List<String> tittles = new ArrayList<>();
        for (LightNovel novel : novels) {
            if (novel.getPrice() <= 400) {
                tittles.add(novel.getTitle());
            }
            if (tittles.size() >= 3) {
                break;
            }
        }

        System.out.println(novels);
        System.out.println(tittles);


    }
}
