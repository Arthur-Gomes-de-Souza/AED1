package AED1.Etapa3;

import java.util.Scanner;

public class c12ex15 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int soma = 0, cont =0;
        double media;
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< numeros.length;aux++) {
            System.out.println("Informe um numero inteiro: ");
            numeros[aux] = tec.nextInt();
        }
        System.out.print("Numeros pares: ");
        for (int aux=0;aux< numeros.length;aux++) {
            if (numeros[aux]%2==0) {
                System.out.print(numeros[aux]+" ");
                soma += numeros[aux];
                cont++;
            }
        }
        media = (float) soma/cont;
        System.out.println();
        System.out.println("Media dos numeros pares = "+media);
        tec.close();
    }
}
