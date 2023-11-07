package academy.devdojo.devdojoacademy.introducao;

public class Aula05Condicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprar = idade >= 18;
        if(isAutorizadoComprar){
            System.out.println("Autorizado");
        }

        if(!isAutorizadoComprar){
            System.out.println("Não autorizado");
        }

    }
}
