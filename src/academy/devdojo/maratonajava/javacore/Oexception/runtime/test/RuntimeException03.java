package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeException03 {
    public static void main(String[] args) {
        criarConexao2();
    }
    public static String criarConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando o arquivo");

        }
        return null;
    }

    public static void criarConexao2(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando o arquivo");

        }
    }
}
