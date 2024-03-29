package academy.devdojo.devdojoacademy.javacore.Hherança.domain;

public class Pessoa {

    // Protected é somente possível utilizar dentro do pacote
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicialização estático Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização Pessoa");
    }
    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Dentro do construtor pessoa");
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getCep() + " " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
