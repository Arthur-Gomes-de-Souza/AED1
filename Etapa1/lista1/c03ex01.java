package AED1.Etapa1.lista1;
import java.util.Scanner;
public class c03ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        long numero = teclado.nextLong();
        long fatorial = 1L;
        for (long contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;
        }
        System.out.println("Fatorial = " + fatorial);
        teclado.close();
    }
}
