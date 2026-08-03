package academy.devdojo.maratonajava.IFBA_PART2.PaisesFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArquivoPaises {
    public void salvarPaises(List<String> paises){
        File file = new File("/home/brenopamponet/Área de trabalho/maratona-java/src/academy/devdojo/maratonajava/IFBA_PART2/PaisesFile/paises.txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (int i = 0; i < paises.size(); i++) {
                writer.write(paises.get(i));
                if (i < paises.size() - 1) { // Garante que nao tenha linhas vazias
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
