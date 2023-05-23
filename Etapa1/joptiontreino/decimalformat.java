package AED1.Etapa1.joptiontreino;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class decimalformat {
    public static void main(String[] args) {
        double valor = 12005.867;
        String valorF;
        valorF = new DecimalFormat("#,##0.00").format(valor);
        JOptionPane.showMessageDialog(null,
                "Valor formatado: "+valorF,
                "Formatando",
                JOptionPane.INFORMATION_MESSAGE);
        valorF = new DecimalFormat("#,##0.000").format(valor);
        JOptionPane.showMessageDialog(null,
                "Novo valor formatado: "+valorF,
                "Formatando",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
