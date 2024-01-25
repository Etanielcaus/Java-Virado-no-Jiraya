package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;
// enumerações são uma forma de representar um conjunto fixo de valores nomeados. Enumerações
// são frequentemente utilizadas
// para representar constantes ou conjuntos de valores que são semanticamente relacionados.
public class Cliente {
    private String nome;
    private String tipo;

    public Cliente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
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
