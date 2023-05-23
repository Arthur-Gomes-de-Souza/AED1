package AED1.Etapa3;

import java.util.Scanner;

public class c12ex02 {
    public static void main(String[] args) {
        int vet[] = new int[10];
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< vet.length;aux++){
            System.out.println("Informe um valor numerico: ");
            vet[aux] = tec.nextInt();
        }
        for (int aux=0;aux< vet.length;aux++) {
            if (vet[aux] > 5 && vet[aux] < 10) {
                System.out.print(vet[aux]+" ");
            }
        }
        tec.close();
    }
}
