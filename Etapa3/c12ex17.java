package AED1.Etapa3;

import java.util.Scanner;

public class c12ex17 {
    public static void main(String[] args) {
        int[] vet1 = new int[10], vet2 = new int[10];
        Scanner tec = new Scanner(System.in);
        for (int aux=0;aux< vet1.length;aux++) {
            System.out.println("Informe um numero inteiro: ");
            vet1[aux] = tec.nextInt();
        }
        for (int aux= vet1.length-1;aux>=0;aux--) {
            vet2[aux] = vet1[aux];
            System.out.println(vet2[aux]+" ");
        }
        tec.close();
    }
}
