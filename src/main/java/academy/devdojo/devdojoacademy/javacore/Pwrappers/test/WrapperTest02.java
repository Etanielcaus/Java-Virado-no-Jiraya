package academy.devdojo.devdojoacademy.javacore.Pwrappers.test;

public class WrapperTest02 {
    public static void main(String[] args) {
        Integer intW = 12; // boxing
        int i = intW; // unboxing

        Integer intW2 = i;
        System.out.println(intW2);
        System.out.println("-===");
        System.out.println(intW.intValue());
        Integer int2W = Integer.parseInt("2");
        System.out.println(int2W);
    }
}
