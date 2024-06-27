package academy.devdojo.devdojoacademy.javacore.YColections.dominio;

import java.util.Objects;
import java.util.Scanner;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String titulo;
    private double preco;

    public Manga(Long id, String titulo, double preco) {
        Objects.nonNull(id);
        Objects.nonNull(titulo);
        Objects.nonNull(preco);
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(titulo, manga.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga o) {
//        negativo se o this < o
//        se this == o retorna 0
//        positivo se o this > Manga
//        Basicamente, implementa o método na classe e Overide no compareTo...

//        Se for tipo primitivo:
//        if (this.id < o.getId()){
//            return -1;
//        } else if (this.id.equals(o.getId())){
//            return 0;
//        }else {
//            return 1;
//        }

//        Long:
//        return this.id.compareTo(o.getId());

//        Double
//        return Double.valueOf(preco).compareTo(Double.valueOf(o.preco));
//        return Double.compare(preco, o.getPreco());

//        String
        return this.titulo.compareTo(o.getTitulo());

    }
}
