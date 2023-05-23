package AED1.Etapa3;

import java.util.Scanner;

public class c12ex20 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int cont=0,soma=0;
        double media;
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< numeros.length;aux++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[aux] = tec.nextInt();
        }
        System.out.print("Numeros maiores que o ultimo numero informado: ");
        for (int aux=0;aux< numeros.length;aux++) {
            if (numeros[aux]>numeros[9]) {
                System.out.print(numeros[aux]+" ");
                soma += numeros[aux];
                cont++;
            }
        }
        System.out.println();
        media = (float) soma/cont;
        System.out.println("Media = "+media);
        tec.close();
    }
}
