package AED1.Etapa2;
import java.util.Scanner;
public class c08ex14 {
    public static void main(String[] args) {
        int numero;
        String simbolo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero para o tamanho da matriz: ");
        numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Insira o simbolo que aparecera: ");
        simbolo = teclado.nextLine();
        for (int aux = 1; aux<= numero; aux++) {
            System.out.println();
            for (int i = 1; i <= numero; i++) {
                System.out.print(simbolo+" ");
            }
        }
        teclado.close();
    }
}
