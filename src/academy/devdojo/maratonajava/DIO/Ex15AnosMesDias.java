package javacore.DIO;

import java.util.Scanner;

public class Ex15AnosMesDias {
    static void main(String[] args) {
        // 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
        //
        //consideração o ano com 365 dias e o mês com 30 dias.
        //
        //(Ex: 5 anos, 2 meses e 15 dias de vida)

        Scanner scanner = new Scanner(System.in);
        String currentDate = scanner.next();
        String birthDate = scanner.next();
        String[] birthPart = birthDate.split("/");
        String[] currentPart = currentDate.split("/");
        int diaNascimento = Integer.parseInt(birthPart[0]);
        int mesNascimento = Integer.parseInt(birthPart[1]);
        int anoNascimento = Integer.parseInt(birthPart[2]);

        int diaAtual = Integer.parseInt(currentPart[0]);
        int mesAtual = Integer.parseInt(currentPart[1]);
        int anoAtual = Integer.parseInt(currentPart[2]);

        int totalDiasAtual = anoAtual * 365 + mesAtual * 30 + diaAtual;
        int totalDiasNascimento = anoNascimento * 365 + mesNascimento * 30 + diaNascimento;

        int diasVividos = totalDiasAtual - totalDiasNascimento;

        int anos = diasVividos / 365;
        diasVividos = diasVividos % 365;

        int meses = diasVividos / 30;
        diasVividos = diasVividos % 30;

        int dias = diasVividos;

        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias de vida");

    }
}
