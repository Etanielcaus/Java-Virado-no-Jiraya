package academy.devdojo.devdojoacademy.javacore.Gassociação.domain;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private Professor[] professores;
    private List<Professor> professors;

    // Adicionar dinamicamente o professor a escola dentro de uma lista
    public Escola(String nome) {
        this.nome = nome;
        this.professors = new ArrayList<>();
    }

    // Adicionar atraves de um array junto ao instanciar a escola
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    // Imprime o Array
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if (professores == null) return;
        for (Professor professore : professores) {
            if (professore.getMateria() == null){
                System.out.println("Professor: " + professore.getNome());
            } else {
                System.out.println("Professor: " + professore.getNome() + " Matéria: " + professore.getMateria());
            }
        }
        System.out.println("---");
    }

    //Imprime na forma de ArrayList, e checa se o professor tem matéria adicionada.
    public void imprimeList() {
        System.out.println("Nome da escola: " + this.nome);
        if (professors == null) return;
        for (Professor professor : professors) {
            if (professor.getMateria() == null) {
                System.out.println("Nome: " + professor.getNome());
            } else {
                System.out.println("Nome: " + professor.getNome() + " Matéria: " + professor.getMateria());
            }
        }
    }

    public void addProfessor(Professor nome){
        this.professors.add(nome);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
