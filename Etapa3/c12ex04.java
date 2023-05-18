package Etapa3;

import java.util.Scanner;

public class c12ex04 {
    public static void main(String[] args) {
        String vet1[] = new String[20], vet2[] = new String[10];
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux<vet1.length;aux++){
            System.out.println("Informe o numero do corredor na sequencia de chegada: ");
            vet1[aux] = tec.nextLine();
        }
        for (int aux=0;aux< vet2.length;aux++){
            System.out.println("Corredor numero "+vet1[aux]+" e corredor numero "+vet1[aux+10]);
        }
        tec.close();
    }
}
