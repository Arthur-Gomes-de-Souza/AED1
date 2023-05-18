package Etapa3;

import java.util.Scanner;

public class c12ex12 {
    public static void main(String[] args) {
        int[] nota = new int[50];
        int maiorNota = 0;
        String[] nome = new String[50];
        Scanner tec = new Scanner(System.in);

        for (int aux = 0; aux < nome.length; aux++) {
            System.out.println("Informe o seu nome: ");
            nome[aux] = tec.nextLine();
            System.out.println("Informe sua nota: ");
            nota[aux] = tec.nextInt();
            tec.nextLine();
        }
        for (int aux = 0; aux < nota.length; aux++) {
            if (nota[aux] > maiorNota) {
                maiorNota = nota[aux];
            }
        }
        for (int aux=0;aux<nota.length;aux++) {
            if (nota[aux] == maiorNota) {
                System.out.print(nome[aux]+" ");
            }
        }
        tec.close();
    }
}
