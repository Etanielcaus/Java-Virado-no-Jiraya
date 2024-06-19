package academy.devdojo.devdojoacademy.javacore.XSerialization.test;

import academy.devdojo.devdojoacademy.javacore.XSerialization.dominio.Aluno;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Joao", "123");
//        serializar(aluno);
        deserializar();
    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void deserializar(){
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) oos.readObject();
            System.out.println(aluno.toString());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
