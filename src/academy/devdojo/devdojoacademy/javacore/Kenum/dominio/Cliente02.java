package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;

public class Cliente02 {
    private String nome;
    private TipoCliente tipoClienteFisica;

    public Cliente02(String nome, TipoCliente tipoClienteFisica) {
        this.nome = nome;
        this.tipoClienteFisica = tipoClienteFisica;
    }

    @Override
    public String toString() {
        return "Cliente02{" +
                "nome='" + nome + '\'' +
                ", tipoClienteFisica=" + tipoClienteFisica +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoClienteFisica() {
        return tipoClienteFisica;
    }

    public void setTipoClienteFisica(TipoCliente tipoClienteFisica) {
        this.tipoClienteFisica = tipoClienteFisica;
    }
}
