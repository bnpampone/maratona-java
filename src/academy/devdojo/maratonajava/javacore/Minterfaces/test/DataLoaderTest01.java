package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader data = new DatabaseLoader();
        FileLoader file = new FileLoader();
        data.load();
        file.load();
        data.remove();
        file.remove();

        data.checkPermission();
        file.checkPermission();

        DatabaseLoader.retriveMaxDataSize();
        DataLoader.retriveMaxDataSize();
    }
}
