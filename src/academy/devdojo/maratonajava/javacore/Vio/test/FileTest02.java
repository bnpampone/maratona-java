package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDir = new File("pasta");
        boolean isDiretorioCreated = fileDir.mkdir();
        System.out.println("isDiretorioCreated " + isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDir, "arquivo.txt");
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
            System.out.println("isFileCreated " + isFileCreated);


            File fileRenamed = new File(fileDir, "arquivo_renomeado.txt");
            boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
            System.out.println(isRenamed);


            File diretorioRenamed = new File("pasta2");
            boolean isDiretorioRenamed = fileDir.renameTo(diretorioRenamed);
            System.out.println("isDiretorioRenamed " + isDiretorioRenamed);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
