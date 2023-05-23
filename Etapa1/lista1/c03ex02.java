package AED1.Etapa1.lista1;
import java.util.Scanner;
public class c03ex02 {
    public static void main(String[] args) {
        long n1, n2, n3, soma;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        n1 = teclado.nextLong();
        System.out.println("Informe outro numero: ");
        n2 = teclado.nextLong();
        System.out.println("Informe mais um numero: ");
        n3 = teclado.nextLong();
        soma = n1 + n2 + n3;
        media = soma/3.0;
        System.out.println("Media = " + media);
        teclado.close();
    }
}
