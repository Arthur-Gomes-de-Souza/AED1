package Etapa2;

import java.util.Scanner;

public class c11ex11 {
    public static void main(String[] args) {
        int rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero inteiro entre 1 e 9: ");
        rep= teclado.nextInt();

        for (int aux=1;aux<=rep;aux++) {
            for (int aux2=1;aux2<=aux;aux2++) {
                System.out.print(aux+" ");
            }
            System.out.println();
        }
        teclado.close();
    }
}
