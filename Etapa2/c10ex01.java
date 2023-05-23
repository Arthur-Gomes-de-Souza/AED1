package AED1.Etapa2;
import java.util.Scanner;
public class c10ex01 {
    public static void main(String[] args) {
        double multa, valor, media, somaMulta =0;
        int contMulta = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("O valor para interromper a repeticao e -1.");
        do {
            System.out.println("Informe o valor financeiro: ");
            valor = teclado.nextDouble();
            if (valor != -1) {
                multa = 0.1 * valor;
                System.out.println("Multa = " + multa);
                contMulta++;
                somaMulta += multa;
            }
        } while (valor != -1);
        media = somaMulta/contMulta;
        System.out.println("Media = "+ media);
        teclado.close();
    }
}
