package AED1.Etapa3;

import java.util.Scanner;

public class c12ex22 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< numeros.length;aux++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[aux] = tec.nextInt();
        }
        for (int aux=0;aux< numeros.length;aux++) {
            if (aux%2==0)
                System.out.print(numeros[aux]+" ");
        }
        for (int aux=0;aux< numeros.length;aux++) {
            if (aux%2==1)
                System.out.print(numeros[aux]+" ");
        }
        tec.close();
    }
}
