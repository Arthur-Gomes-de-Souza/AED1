package AED1.Etapa1.lista2;
import javax.swing.JOptionPane;
public class c04ex04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,
                "Qual o seu primeiro nome?",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        String nomeMeio = JOptionPane.showInputDialog(null,
                "Qual seu nome do meio?",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null,
                "Qual o seu sobrenome?",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        String idade = JOptionPane.showInputDialog(null,
                "Qual a sua idade?",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                sobrenome+", "+nome+" "+nomeMeio+"\nIdade: "+idade+" anos",
                "Dados",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
