package academy.devdojo.devdojoacademy.javacore.Qstrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Et"; // String constant pool
        String nome2 = "Et"; // String constant pool
        System.out.println(nome == nome2); // Compara se ele faz referencia ao mesmo objeto dentro do String pool
        System.out.println(nome.equals(nome2));

        String nome3 = "Eta";
        System.out.println(nome == nome3);

//        nome3.concat(" Ca");  // Não existe uma variável de referencia para este objeto, as Strings são imutaveis,
        // Portanto, é necessário adicionar a uma nova variável de referencia.
//        Mas é possivel alterar o valor de referencia.
//        nome3 = nome3.concat(" Ca");
        String nome4 = nome3.concat(" Ca");
        System.out.println(nome4);

        String nome5 = new String("Eta"); // Aqui ele cria um objeto, porém é um objeto fora do pool Strings
        System.out.println(nome5);
        System.out.println(nome3.equals(nome5.intern())); // Intern é o proprio valor de dentro da referencia



    }
}
