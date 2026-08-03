package academy.devdojo.maratonajava.IFBA_PART2.PaisesFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> paises = new ArrayList<>();
        paises.add("Portugal");
        paises.add("Brasil");
        paises.add("Espanha");
        paises.add("França");
        paises.add("Itália");
        paises.add("Austrália");
        paises.add("EUA");
        paises.add("Canadá");

        ArquivoPaises arquivo = new ArquivoPaises();
        arquivo.salvarPaises(paises);

    }
}
