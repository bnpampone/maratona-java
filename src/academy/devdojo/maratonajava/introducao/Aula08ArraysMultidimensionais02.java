package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
    int[][] arrayInt = new int[2][];
    arrayInt[0] = new int[]{1,2,3,4,5};
    arrayInt[1] = new int []{3,4,5};

    // OUUUU
        int[][] arrayInt2 = {{1,2,3,4,5}, {6,7,8}};

    for(int[] arrayBase : arrayInt2){
        System.out.println("------------");
        for(int num : arrayBase){
            System.out.println(num + " ");
        }
        }
    }
}
