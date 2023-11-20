package academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDois(){
        System.out.println(10 + 10);
    }

    public void somarDoisComParametros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public double somarDoisParametros(int num1, int num2) {
        return num1 + num2;
    }

    public double divideDoisParametros(double num1, double num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeParametrosDivisao(double num1, double num2){
        if (num1 == 0 || num2 == 0){
            System.out.println("Não existe divisão por zero");
        } else {
            double res = divideDoisParametros(num1, num2);
            System.out.println(res);
        }
    }
}
