package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;

public class Cliente03 {
    public enum TipoPagamento{ // A melhor maneira de fazer isso, é colocando em uma nova "Class"
        CREDITO,
        DEBITO
    };
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento; // Ainda assim, é necessário declarar.

    public Cliente03(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente03{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() + " " + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
