package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for(String countries : isoCountries){
            System.out.print(countries + " ");
        }
        System.out.println();
        for(String language : isoLanguages){
            System.out.print(language + " ");
        }
    }
}
