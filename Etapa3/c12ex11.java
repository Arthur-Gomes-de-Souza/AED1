package AED1.Etapa3;

import java.util.Scanner;

public class c12ex11 {
    public static void main(String[] args) {
        int[] nota = new int[50];
        int maiorNota = 0;
        String[] nome = new String[50];
        String maiorNome="";
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< nome.length;aux++) {
            System.out.println("Informe o seu nome: ");
            nome[aux] = tec.nextLine();
            System.out.println("Informe sua nota: ");
            nota[aux] = tec.nextInt();
            tec.nextLine();
        }
        for (int aux=0;aux< nota.length;aux++) {
            if (nota[aux]>maiorNota) {
                maiorNota = nota[aux];
                maiorNome = nome[aux];
            }
        }
        System.out.println(maiorNome);
        tec.close();
    }
}
