package Etapa1.joptiontreino;
import javax.swing.JOptionPane;
public class conversao {
    public static void main(String[] args) {
        String nome, numFilhosStr;
        nome = JOptionPane.showInputDialog(null,
                "Qual seu nome? ",
        "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        numFilhosStr = JOptionPane.showInputDialog(null,
                "Quantos filhos você tem? ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        int numFilhos = Integer.valueOf(numFilhosStr);
        JOptionPane.showMessageDialog(null,
                "Nome: "+nome+"\nQuantidade de filhos: "+numFilhos,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
// int para String: String variavel= Integer.toString(nova variavel);
// long para String: String variavel= Long.toString(nova variavel);
// float para String: String variavel= Float.toString(nova variavel);
// double para String: String variavel= Double.toString(nova variavel);
// String para int: int nova variavel= Integer.valueOf(variavel);
// String para long: long nova variavel= Long.valueOf(variavel);
// String para float: float nova variavel= Float.valueOf(variavel);
// String para double: double nova variave= Double.valueOf(variavel);