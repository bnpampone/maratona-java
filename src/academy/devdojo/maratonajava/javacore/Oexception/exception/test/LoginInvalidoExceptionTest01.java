package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
       String usarnameDB = "Goku";
       String senhaDB = "ssj";

        System.out.println("Usuario: ");
        String nameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = scanner.nextLine();

        if(!usarnameDB.equals(nameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuarios ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
