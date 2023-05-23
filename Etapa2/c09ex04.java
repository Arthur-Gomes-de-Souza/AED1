package AED1.Etapa2;

import java.util.Scanner;

public class c09ex04 {
    public static void main(String[] args) {
        double serie = 0, num, den;
        int rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos a serem gerados: ");
        rep = teclado.nextInt();

        for (int aux=1;aux<=rep;aux++) {
            num = (aux * 4 - 3) * (aux * 4 - 2);
            den = (aux * 4 - 1) * (aux * 4);
            serie += num / den;
        }
        serie = Math.sqrt(serie);
        System.out.println("Valor da serie = "+ serie);
        teclado.close();
    }
}
