package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        // \d todos os digitos
        // \D todos os não digitos
        // \s espaços minusculos \t \n \f \r
        // \S todos caracteres excluindo os brancos
        // \w a-z ou A-Z, digitos (0 - 9), e _
        // \W tudo que não for incluso no \w
        // []
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "abaaba";
        String texto2 = "12 0x 0X 0XFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
