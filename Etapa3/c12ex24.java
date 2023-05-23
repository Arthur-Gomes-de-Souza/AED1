package AED1.Etapa3;

import java.util.Scanner;

public class c12ex24 {
    public static void main(String[] args) {
        int[] vet1 = new int[10], vet2 = new int[10];
        int cont=0;
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< vet1.length;aux++) {
            System.out.println("Digite um numero inteiro: ");
            vet1[aux] = tec.nextInt();
        }
        for (int aux=0;aux< vet1.length;aux++) {
            if (vet1[aux]%3==0) {
                vet2[cont] = vet1[aux];
                cont++;
            }
        }
        for (int aux=0;aux< vet1.length;aux++) {
            System.out.print(vet2[aux]+" ");
        }
        tec.close();
    }
}
