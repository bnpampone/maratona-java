package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("dentor do do-while"+ count++);
        } while(count<10);

        for(count =1;count<=10;count++){
            System.out.println("Valor de for é " + count);
        }
    }
}
