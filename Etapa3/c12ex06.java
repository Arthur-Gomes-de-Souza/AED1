package Etapa3;

import java.util.Scanner;

public class c12ex06 {
    public static void main(String[] args) {
        String vet[] = new String[12];
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< vet.length;aux++) {
            System.out.println("Informe o nome do mes em ordem cronologica: ");
            vet[aux] = tec.nextLine();
        }
        for (int aux= vet.length-1;aux>=0;aux--) {
            System.out.println(vet[aux]+" ");
        }
        tec.close();
    }
}
