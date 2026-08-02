package javacore.DIO;

public class Ex18FranciscoESara {
    static void main(String[] args) {
        // 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
        double francisco = 150;
        double fincrementa = 2;
        double sara = 110;
        double sincrementa = 3;
        double ano = 0;

        while(sara <= francisco){
            francisco += fincrementa;
            sara += sincrementa;
            ano++;
        }
        System.out.println(ano);
    }
}
