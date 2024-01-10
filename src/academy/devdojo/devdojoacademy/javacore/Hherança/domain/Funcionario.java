package academy.devdojo.devdojoacademy.javacore.Hherança.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }
    public void imprime(){
        System.out.println("Classe super");
        super.imprime();
        System.out.println("Classe Atual");
        System.out.println(this.salario);
    }

    public void imprimerelatorio(){
        System.out.println("O funcionario " + this.nome + " recebeu o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
