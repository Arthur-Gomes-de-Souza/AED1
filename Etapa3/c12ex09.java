package Etapa3;

import java.util.Scanner;

public class c12ex09 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int soma = 0;
        Scanner tec = new Scanner(System.in);

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("Informe um numero inteiro: ");
            vet[aux] = tec.nextInt();
        }
        for (int aux = 0; aux < vet.length; aux++) {
            soma += vet[aux];
        }
        for (int aux=0;aux< vet.length;aux++) {
            if (soma % vet[aux] == 0){
                System.out.print(vet[aux]+" ");
                
            }
        }
        tec.close();
    }
}
