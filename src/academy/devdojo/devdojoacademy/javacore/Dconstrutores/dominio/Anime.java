package academy.devdojo.devdojoacademy.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String novoNome, String tipoDoAnime, int quantosEpisodios, String qualGenero){
        this();
        this.nome = novoNome;
        this.tipo = tipoDoAnime;
        this.episodios = quantosEpisodios;
        this.genero = qualGenero;
    }

    // Sobrecarga de construtores
    public Anime(){

    }

    public Anime(String novoNome, String tipoDoAnime, int quantosEpisodios, String qualGenero, String estudio){
        this(novoNome, tipoDoAnime, quantosEpisodios, qualGenero);
        this.estudio = estudio;
    }

    public void imprimeComThis(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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
