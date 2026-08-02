package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerfomaceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concactString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a String " + (fim - inicio + "ms"));


        inicio = System.currentTimeMillis();
        concactStringBuilder(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a String " + (fim - inicio + "ms"));

        inicio = System.currentTimeMillis();
        concactStringBuffer(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a String " + (fim - inicio + "ms"));

    }

    private static void concactString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto+= i;
        }
    }

    private static void concactStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concactStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
