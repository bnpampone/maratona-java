package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        // \d todos os digitos
        // \D todos os não digitos
        // \s espaços minusculos \t \n \f \r
        // \S todos caracteres excluindo os brancos
        // \w a-z ou A-Z, digitos (0 - 9), e _
        // \W tudo que não for incluso no \w
        // []
        // ? Zero ou Uma ocorrencias
        // * Zero ou mais ocorrencias
        // + Uma ou mais ocorrencias
        // {n,m} de n até m ocorrencias
        // ()
        // | ex: o(v|c)o => ovo | oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3...
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, @#!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("@#!zoro@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
