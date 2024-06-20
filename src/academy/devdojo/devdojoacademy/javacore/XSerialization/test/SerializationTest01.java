package academy.devdojo.devdojoacademy.javacore.XSerialization.test;

import academy.devdojo.devdojoacademy.javacore.XSerialization.dominio.Aluno;
import academy.devdojo.devdojoacademy.javacore.XSerialization.dominio.Turma;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Turma turma = new Turma("dev");
        Aluno aluno = new Aluno(1L, "Joao", turma, "123");
//        serializar(aluno);
        deserializar();
    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("arquivo/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void deserializar(){
        Path path = Paths.get("arquivo/aluno.ser");
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) oos.readObject();
            System.out.println(aluno.toString());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
