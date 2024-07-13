package academy.devdojo.devdojoacademy.javacore.ZZClassesInternas.test;

public class OuterClassesTest01 {
    private String name = "Joao";

    class Inner {
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();

        new OuterClassesTest01().new Inner().printOuterClassAtribute();
        inner.printOuterClassAtribute();
    }
}
