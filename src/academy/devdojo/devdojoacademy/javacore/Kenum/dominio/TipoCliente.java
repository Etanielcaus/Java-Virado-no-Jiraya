package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int VALOR;
    private final String NOME_RELATORIO;
    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    public int getValor() {
        return VALOR;
    }

    public String getNomeRelatorio(){
        return NOME_RELATORIO;
    }
}
