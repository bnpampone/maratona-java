package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Breno Pamponet", "20276500");
        Turma turma = new Turma("Maratona Java em Breve Ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }
    private static void serializar(Aluno aluno){
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("pasta/aluno.serializado")))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserializar(){
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("pasta/aluno.serializado")))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
