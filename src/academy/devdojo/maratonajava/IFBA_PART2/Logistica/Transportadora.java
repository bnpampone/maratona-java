package javacore.IFBA_PART2.Logistica;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Transportadora {
    public static void main(String[] args) {
        Motorista[] motoristas = new Motorista[10];

        int option = 0;
        int index = 0;

        while (option != 3) {
            option = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Motorista\n" +
                    "2- Motoristas Cadastrados\n" +
                    "3- Sair\n"));
            switch (option) {
                case 1:
                    if (index < motoristas.length) {

                        int m = Integer.parseInt(JOptionPane.showInputDialog("Informe sua MATRICULA: "));
                        String n = JOptionPane.showInputDialog("Informe seu NOME: ");
                        String ct = JOptionPane.showInputDialog("Informe seu CTPS: ");
                        int i = Integer.parseInt(JOptionPane.showInputDialog("Informe sua IDADE: "));
                        String cn = JOptionPane.showInputDialog("Informe sua CNH: ");
                        String cat = JOptionPane.showInputDialog("Informe a CATEGORIA da CNH(A,B,AB,D): ");

                        motoristas[index] = new Motorista(m, n, ct, i, cn, cat);
                        index++;
                    } else {
                        JOptionPane.showMessageDialog(null, "ATINGIU O NUMERO MAXIMO DE " + motoristas.length);
                    }
                    break;

                case 2:
                    if (index == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum usuario CADASTRADO!");
                    } else {
                        String motoristasList = "";
                        for (int i = 0; i < motoristas.length; i++) {
                            if (motoristas[i] == null) {
                                motoristasList += "POSIÇÃO DE MOTORISTA LIVRE \n";
                            } else {
                                motoristasList += motoristas[i] + "\n";
                            }
                        }

                        JOptionPane.showMessageDialog(null, motoristasList);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida!");
            }
        }
    }
}
