package Etapa2;

import java.util.Scanner;

public class c09ex09 {
    public static void main(String[] args) {
        double serie = 0, num, den;
        int rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos a serem gerados: ");
        rep = teclado.nextInt();

        for (int aux=1;aux<=rep;aux++) {
            num = Math.pow(3,aux) *3;
            den = (aux+9) * Math.sqrt(Math.pow(aux,4));
            serie += num/den;
        }
        serie = 100 - (Math.pow(serie,3));
        System.out.println("Valor da serie = "+ serie);
        teclado.close();
    }
}
