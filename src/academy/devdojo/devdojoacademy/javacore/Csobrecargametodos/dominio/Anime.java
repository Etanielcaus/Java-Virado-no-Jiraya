package academy.devdojo.devdojoacademy.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String novoNome, String tipoDoAnime, int quantosEpisodios){
        this.nome = novoNome;
        this.tipo = tipoDoAnime;
        this.episodios = quantosEpisodios;
    }

    public void init(String novoNome, String tipoDoAnime, int quantosEpisodios, String qualGenero) {
        this.init(novoNome, tipoDoAnime, quantosEpisodios);
        this.genero = qualGenero;
    }
    public void imprimeComThis(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
    public void imprime(){
        System.out.println(getNome());
        System.out.println(getTipo());
        System.out.println(getEpisodios());
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}
