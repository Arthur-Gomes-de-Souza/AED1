package AED1.Etapa3;

import java.util.Scanner;

public class c12ex07 {
    public static void main(String[] args) {
        String[] nome = new String[5];
        int[] nota = new int[5];
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< nome.length;aux++) {
            System.out.println("Informe o nome do aluno: ");
            nome[aux] = tec.nextLine();
            System.out.println("Informe a nota final do aluno: ");
            nota[aux] = tec.nextInt();
            tec.nextLine();
        }
        for (int aux=0;aux< nota.length;aux++) {
            if (nota[aux]<=30)
                System.out.println("Nome: "+nome[aux]+"  Conceito: D");
            else if (nota[aux]<60) {
                System.out.println("Nome: "+nome[aux]+"  Conceito: C");
            } else if (nota[aux]<80) {
                System.out.println("Nome: "+nome[aux]+"  Conceito: B");
            }
            else {
                System.out.println("Nome: "+nome[aux]+"  Conceito: A");
            }
        }
        tec.close();
    }
}
