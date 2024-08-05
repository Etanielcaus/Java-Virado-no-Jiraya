package academy.devdojo.devdojoacademy.javacore.XSerialization.dominio;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private transient Turma turma;
    private transient String password;
    private static final String ESCOLA = "DevDojo";

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public Aluno(Long id, String nome, Turma turma, String password) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.password = password;
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(turma.getNome());
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        String nomeTurma = in.readUTF();
        turma = new Turma(nomeTurma);
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", ESCOLA='" + ESCOLA + '\'' +
                ", Turma='" + turma.getNome() + '\'' +
                '}';
    }
}
