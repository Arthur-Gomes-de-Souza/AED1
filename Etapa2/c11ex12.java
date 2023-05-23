package AED1.Etapa2;

import java.util.Scanner;

public class c11ex12 {
    public static void main(String[] args) {
        int rep,conta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero inteiro entre 1 e 9: ");
        rep= teclado.nextInt();
        for (int aux=1;aux<=rep;aux++) {
            for (int aux1=1;aux1<=aux;aux1++) {
                System.out.print(aux1);
            }
            for (int aux1=aux;aux1>=1;aux1--) {
                System.out.print(aux1);
            }
            System.out.println();
        }
        teclado.close();
    }
}
