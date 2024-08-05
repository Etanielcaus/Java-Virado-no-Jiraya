package academy.devdojo.devdojoacademy.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    private  int[] episodios2;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[4];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome, int[] episodios2) {
        this.nome = nome;
        this.episodios2 = episodios2;
    }

    public Anime() {
        for (int index:
             Anime.episodios) {
             System.out.print(index + " ");
        }
    }


    public int[] getEpisodios2() {
        for (int i:
             this.episodios2) {
            System.out.println(i);
        }
        return episodios2;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
