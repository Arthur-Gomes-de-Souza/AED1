// Arthur Gomes de Souza
package prova;

import javax.swing.JOptionPane;

public class d21358B {
    public static void main(String[] args) {
        String nome1, nome2, nome3, quantVoto1, quantVoto2, quantVoto3, quantVotoBranco, quantVotoNulo, vencedor;
        int quantVotoVencedor, votosInvalidos;
        nome1 = JOptionPane.showInputDialog(null,
                "Informe o nome do candidato 1: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        nome2 = JOptionPane.showInputDialog(null,
                "Informe o nome do candidato 2: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        nome3 = JOptionPane.showInputDialog(null,
                "Informe o nome do candidato 3: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        quantVoto1 = JOptionPane.showInputDialog(null,
                "Informe a quantidade de votos do candidato 1: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        quantVoto2 = JOptionPane.showInputDialog(null,
                "Informe a quantidade de votos do candidato 2: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        quantVoto3 = JOptionPane.showInputDialog(null,
                "Informe a quantidade de votos do candidato 3: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        quantVotoBranco = JOptionPane.showInputDialog(null,
                "Informe a quantidade de votos em branco: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        quantVotoNulo = JOptionPane.showInputDialog(null,
                "Informe a quantidade de votos nulos: ",
                "Eleicao",
                JOptionPane.INFORMATION_MESSAGE);
        int votoBranco = Integer.valueOf(quantVotoBranco);
        int votoNulo = Integer.valueOf(quantVotoNulo);
        int votoCand1 = Integer.valueOf(quantVoto1);
        int votoCand2 = Integer.valueOf(quantVoto2);
        int votoCand3 = Integer.valueOf(quantVoto3);
        votosInvalidos = votoBranco + votoNulo;
        if (votoCand1 > votoCand2 && votoCand1 > votoCand3) {
            vencedor = nome1;
            quantVotoVencedor = votoCand1;
        } else {
            if (votoCand2 > votoCand1 && votoCand2 > votoCand3) {
                vencedor = nome2;
                quantVotoVencedor = votoCand2;

            } else {
                vencedor = nome3;
                quantVotoVencedor = votoCand3;
            }
        }
        if (quantVotoVencedor > votosInvalidos) {
            JOptionPane.showMessageDialog(null,
                    "Vencedor: " + vencedor,
                    "Eleicao",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "ELEICAO INVALIDA.",
                    "Eleicao",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
