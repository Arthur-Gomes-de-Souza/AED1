package AED1.Etapa2;

import java.util.Scanner;

public class c09ex05 {
    public static void main(String[] args) {
        double serie = 0, num, den;
        int rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos a serem gerados: ");
        rep = teclado.nextInt();

        for (int aux=1;aux<=rep;aux++) {
            num = (aux*2-2) + (aux*3);
            den = aux*6+1;
            serie += num/den;
        }
        serie = 5*serie;
        System.out.println("Valor da serie = "+ serie);
        teclado.close();
    }
}
