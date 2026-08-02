package javacore.POO.MetodosRecursivos.somantermos;

public class SomaTermos {
    public static int SomaN(int num){

        if (num == 1){
            return 1;
        }

        return num + SomaN(num - 1);
    }
}
