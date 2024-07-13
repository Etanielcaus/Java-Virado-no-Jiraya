package academy.devdojo.devdojoacademy.javacore.ZZAclassesInternas.test;

public class OuterClassesTest02 {
    private String name = "Pedro";

    void print(String parametro){
        final String lastName = "Silva";
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
                System.out.println(parametro);
            }
        }
        LocalClass local = new LocalClass();
        local.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 test = new OuterClassesTest02();
        test.print("Nomes");
    }
}
