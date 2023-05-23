package AED1.Etapa3;

import java.util.Scanner;

public class c12ex13 {
    public static void main(String[] args) {
        String temp;
        String[] nome = new String[12];
        Scanner tec = new Scanner(System.in);
        for (int aux=0;aux< nome.length;aux++) {
            System.out.println("Informe o mes: ");
            nome[aux] = tec.nextLine();
        }
        for (int aux=0;aux< nome.length - 1;aux++) {
            for (int aux1=0; aux1< nome.length - 1;aux1++) {
                if (nome[aux1].compareToIgnoreCase(nome[aux1+1])>0) {
                    temp = nome[aux1];
                    nome[aux1] = nome[aux1+1];
                    nome[aux1+1] = temp;
                }
            }
        }
        for (int aux=0;aux< nome.length;aux++) {
            System.out.println(nome[aux]);
        }
        tec.close();
    }
}
