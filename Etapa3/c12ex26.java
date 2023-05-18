package Etapa3;

import java.util.Scanner;

public class c12ex26 {
    public static void main(String[] args) {
        String frase;
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = tec.nextLine();
        String[] palavras = frase.split(" ");
        for (int aux=0;aux< palavras.length;aux++)
            System.out.println(palavras[aux]);
        tec.close();
    }
}
