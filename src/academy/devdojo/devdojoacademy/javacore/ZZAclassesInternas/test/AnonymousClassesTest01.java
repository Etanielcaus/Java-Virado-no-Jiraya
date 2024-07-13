package academy.devdojo.devdojoacademy.javacore.ZZAclassesInternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal Walking...");
    }
}

//class Dog extends Animal{
//    public void walk(){
//        System.out.println("Dog Walking...");
//    }
//}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal a = new Animal(){
            public void walk(){
                System.out.println("Walking in the street.");
            }
        };
        a.walk();
    }
}
