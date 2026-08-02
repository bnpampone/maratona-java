package javacore.IFBA_PART2.GerenciadorDAgua;

import javax.swing.JOptionPane;

public class Gerenciador {
    public static void main(String[] args) {
        CaixaDagua caixa = null;
        int option = 0;
        while (option != 5) {
            option = Integer.parseInt(JOptionPane.showInputDialog("1 - Inicializar Caixa D'água\n" +
                    "2 - Adicionar Água\n" +
                    "3 - Retirar Água\n" +
                    "4 - Imprimir Situação\n" +
                    "5 - Sair"));
            switch (option) {
                case 1:
                    int c = Integer.parseInt(JOptionPane.showInputDialog("Inicializar Caixa D'água\n" +
                            "Informe a CAPACIDADE da Caixa D'Água"));
                    caixa = new CaixaDagua(c);
                    break;

                case 2:
                    if(caixa == null){
                        JOptionPane.showMessageDialog(null, "Caixa Não foi INICIALIZADA");
                    } else {
                        int litrosAdicionados = Integer.parseInt(JOptionPane.showInputDialog("Adicionar Litros à Caixa D'água\n" +
                                "Informe a quantidade de litros a ser adicionada na Caixa: "));

                        caixa.setLitros(caixa.getLitros() + litrosAdicionados);
                        caixa.setCaixaVazia(false);
                        if (caixa.getLitros() >= caixa.getCapacidade()) {
                            JOptionPane.showMessageDialog(null, "Caixa TRANSBORDANDO");
                            caixa.setLitros(caixa.getCapacidade());
                            caixa.setCaixaCheia(true);
                        }
                    }
                    break;

                case 3:
                    if(caixa == null){
                        JOptionPane.showMessageDialog(null, "Caixa Não foi INICIALIZADA");

                    } else {
                        int litrosRetirados = Integer.parseInt(JOptionPane.showInputDialog("=======Retirar Litros da Caixa D'água=======\n" +
                                "Informe a quantidade de litros a ser retirada da Caixa: "));

                        caixa.setLitros(caixa.getLitros() - litrosRetirados);
                        if (caixa.getLitros() <= 0) {
                            JOptionPane.showMessageDialog(null, "Caixa VAZIA");
                            caixa.setLitros(0);
                            caixa.setCaixaVazia(true);
                        }
                        caixa.setCaixaCheia(false);
                    }
                    break;

                case 4:
                    if(caixa == null){
                        JOptionPane.showMessageDialog(null, "Caixa Não foi INICIALIZADA");
                    } else {
                        JOptionPane.showMessageDialog(null, "Situação da Caixa D'Água: " +
                                "CAPACIDADE: " + caixa.getCapacidade() + "\n" +
                                "Quantidade Litros: " + caixa.getLitros() + "\n" +
                                "Caixa Está Cheia: " + caixa.isCaixaCheia() + "\n" +
                                "Caixa Está Vazia: " + caixa.isCaixaVazia() + "\n");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
        }
    }
}
