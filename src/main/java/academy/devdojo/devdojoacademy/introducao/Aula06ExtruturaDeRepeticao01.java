package academy.devdojo.devdojoacademy.introducao;
import java.util.ArrayList;
import java.util.List;

public class Aula06ExtruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;
        while (count < 10){
            System.out.println(++count);
            //count = count + 1;
            //count ++;
            //count += 1;
        }

        int outraCont = 0;
        do {
            System.out.println("Aqui ele executa mesmo se a condição while for falsa "+outraCont);
            outraCont++;
        }while (outraCont < 10);



        // Criar uma lista de números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionar elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for (Integer numero: numeros){
            System.out.println(numero);
        }

        // for (variavel; condicao; mudanca)
        for (int i=0; i <10; i++){
            System.out.println("FOR "+i);
        }
    }
}
