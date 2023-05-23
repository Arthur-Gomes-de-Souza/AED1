package AED1.Etapa3;

import java.util.Scanner;

public class c12ex10 {
    public static void main(String[] args) {
        String[] nome = new String[50];
        int[] nota = new int[50];
        int soma=0;
        double media;
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< nome.length;aux++) {
            System.out.println("Informe o seu nome: ");
            nome[aux] = tec.nextLine();
            System.out.println("Informe sua nota: ");
            nota[aux] = tec.nextInt();
            tec.nextLine();
        }
        for (int aux=0;aux< nota.length;aux++) {
            soma += nota[aux];
        }
        media = (float) soma/ nota.length;
        for (int aux=0;aux< nota.length;aux++) {
            if (nota[aux]>media) {
                System.out.print(nome[aux]+" ");
            }
        }
        tec.close();
    }
}
