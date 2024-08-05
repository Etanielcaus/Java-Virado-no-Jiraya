package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;

public class Cliente02 {
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente02(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente02{" +
                "nome='" + nome + '\'' +
                ", tipoClienteFisica=" + tipoCliente +
                '}';
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
}
