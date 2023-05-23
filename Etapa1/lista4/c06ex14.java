package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex14 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero inteiro de 4 digitos: ");
        numero = teclado.nextInt();
        if (numero>9999 || numero<1000) {
            System.out.println("NUMERO TEM QUE TER 4 DIGITOS.");
        }
        else {
            System.out.println(numero%10+""+numero/10%10+numero/100%10+numero/1000);
        }
        teclado.close();
    }
}
