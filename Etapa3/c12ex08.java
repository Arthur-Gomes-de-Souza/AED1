package Etapa3;

import java.util.Scanner;

public class c12ex08 {
    public static void main(String[] args) {
        int[] vet = new int[20];
        int[] soma = new int[10];
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< vet.length;aux++) {
            System.out.println("Informe um numero inteiro: ");
            vet[aux] = tec.nextInt();
        }
        for (int aux=0;aux< soma.length;aux++) {
            soma[aux] = vet[aux] + vet[aux+10];
            System.out.println(soma[aux]);
        }
        tec.close();
    }
}
