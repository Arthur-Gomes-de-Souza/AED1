package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex05 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um n�mero inteiro: ");
        numero = teclado.nextInt();
        if (numero%5==0 && numero%7==0) {
            System.out.println(numero+" � divis�vel simultaneamente por 5 e 7");
        }
        else {
            System.out.println(numero+" n�o � divis�vel simultaneamente por 5 e 7");
        }
        teclado.close();
    }
}
