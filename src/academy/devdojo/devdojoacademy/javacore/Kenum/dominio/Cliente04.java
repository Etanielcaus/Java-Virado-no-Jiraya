package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;

public class Cliente04 {
    private String nome;
    private double valorDoProduto;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente04(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento, double valorDoProduto) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.valorDoProduto = valorDoProduto;
    }

    @Override
    public String toString() {
        return "Cliente04{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPagamento +
                '}'
                + valorDoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }
}
