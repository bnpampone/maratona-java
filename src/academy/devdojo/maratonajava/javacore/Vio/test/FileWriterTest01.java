package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("O Devdojo é lindo, éeeee do Brasil\nContinuando na proxima linha\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
