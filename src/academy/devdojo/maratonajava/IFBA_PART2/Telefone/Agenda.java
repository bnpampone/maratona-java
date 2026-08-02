package javacore.IFBA_PART2.Telefone;

import javax.swing.*;

public class Agenda {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[40];
        int qntContatos = 0;
        int posContato = 0;
        int opcao = 0;

        while (opcao != 9) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Contato\n" +
                    "2 - Editar Contato\n" +
                    "3 - Excluir Contato\n" +
                    "4 - Primeiro Contato\n" +
                    "5 - Contato Anterior\n" +
                    "6 - Próximo Contato\n" +
                    "7 - Último Contato\n" +
                    "8 - Imprimir Contato Atual\n" +
                    "9 - Sair"));
            switch (opcao) {
                case 1:
                    if (qntContatos < contatos.length) {
                        int cd = Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo do Contato:"));
                        String n = JOptionPane.showInputDialog("Informe o NOME do Contato:");
                        String tel = JOptionPane.showInputDialog("Informe o Telefone do Contato:");

                        contatos[qntContatos] = new Contato(cd, n, tel);
                        qntContatos++;
                    }
                    break;

                case 2:
                    if (contatos[posContato] != null) {
                        int cd = Integer.parseInt(JOptionPane.showInputDialog("Editando Contato do " + contatos[posContato].getNome() + "\n Informe o Codigo do Contato: "));
                        String n = JOptionPane.showInputDialog("Informe o NOME do Contato:");
                        String tel = JOptionPane.showInputDialog("Informe o Telefone do Contato:");
                        JOptionPane.showMessageDialog(null, "Contato ALTERADO com SUCESSO");

                        contatos[posContato] = new Contato(cd, n, tel);
                    }
                    break;

                case 3:
                    if (contatos[posContato] != null) {
                        JOptionPane.showMessageDialog(null, "Contato de " + contatos[posContato].getNome() + " sera DELETADO");
                        contatos[posContato] = null;
                        for (int i = posContato; i < contatos.length - 1; i++) {
                            contatos[i] = contatos[i + 1];
                        }
                        contatos[qntContatos - 1] = null;
                        qntContatos--;
                    }
                    break;
                case 4:
                    if (qntContatos == 0) {
                        JOptionPane.showMessageDialog(null, "NENHUM Contato Cadastrado");
                        break;
                    }
                    posContato = 0;
                    if (contatos[posContato] != null) {
                        JOptionPane.showMessageDialog(null, "Exibindo Informações do PRIMEIRO Contato \n" +
                                "Codigo: " + contatos[posContato].getCodigo() + "\n" +
                                "Nome: " + contatos[posContato].getNome() +
                                "Telefone: " + contatos[posContato].getTelefone());
                    }
                    break;

                case 5:
                    if (posContato != 0) {
                        posContato--;
                    }
                    if (contatos[posContato] != null) {
                        JOptionPane.showMessageDialog(null, "Exibindo Informações do Contato " + contatos[posContato] + "\n" +
                                "Codigo: " + contatos[posContato].getCodigo() + "\n" +
                                "Nome: " + contatos[posContato].getNome() + "\n" +
                                "Telefone: " + contatos[posContato].getTelefone());
                    }
                    break;

                case 6:
                    if (qntContatos == 0) {
                        JOptionPane.showMessageDialog(null, "NENHUM Contato Cadastrado");
                        break;
                    }
                    if (posContato != qntContatos - 1) {
                        posContato++;
                    }
                    if (contatos[posContato] != null) {
                        JOptionPane.showMessageDialog(null, "Exibindo Informações do Contato " + contatos[posContato] + "\n" +
                                "Codigo: " + contatos[posContato].getCodigo() + "\n" +
                                "Nome: " + contatos[posContato].getNome() + "\n" +
                                "Telefone: " + contatos[posContato].getTelefone());
                    }
                    break;
                case 7:
                    if (qntContatos == 0) {
                        JOptionPane.showMessageDialog(null, "NENHUM Contato Cadastrado");
                        break;
                    }
                    if (contatos[qntContatos - 1] != null) {
                        JOptionPane.showMessageDialog(null, "Exibindo Informações do Contato " + contatos[qntContatos - 1] + "\n" +
                                "Codigo: " + contatos[qntContatos - 1].getCodigo() + "\n" +
                                "Nome: " + contatos[qntContatos - 1].getNome() + "\n" +
                                "Telefone: " + contatos[qntContatos - 1].getTelefone());
                    }
                    break;

                case 8:
                    if (contatos[posContato] != null) {
                        JOptionPane.showMessageDialog(null, "Exibindo Informações do Contato:     \n\n" +
                                "Codigo: " + contatos[posContato].getCodigo() + "\n" +
                                "Nome: " + contatos[posContato].getNome() + "\n" +
                                "Telefone: " + contatos[posContato].getTelefone());
                    }
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
        }
    }
}
