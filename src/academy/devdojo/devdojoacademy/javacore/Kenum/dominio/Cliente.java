package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;
// enumerações são uma forma de representar um conjunto fixo de valores nomeados. Enumerações
// são frequentemente utilizadas
// para representar constantes ou conjuntos de valores que são semanticamente relacionados.
public class Cliente {
    private String nome;
    private String tipo;
    public static final String PESSOA_JURIDICA = "Pessoa_juridica";
    public static final String PESSOA_FISICA = "Pessoa_fisica";

    public Cliente(String nome, String tipo) {
        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        if (this.nome == null || this.tipo == null){
            return "Não é possivel efetuar a sobrescrita";
        }
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
