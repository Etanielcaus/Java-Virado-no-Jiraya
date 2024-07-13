package academy.devdojo.devdojoacademy.javacore.ZZClassesInternas.test;

public class OuterClassesTest03 {
    private String name;

    static class Nested{
        void print(){
//            System.out.println(name);
            System.out.println(new OuterClassesTest03().name);
        }
    }

    public static void main(String[] args) {
    new Nested().print();
    }
}
