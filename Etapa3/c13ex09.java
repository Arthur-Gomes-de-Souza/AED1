package AED1.Etapa3;

import java.util.Scanner;

public class c13ex09 {
    public static void main(String[] args) {
        String frase,primeiraLetra,restante;
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira uma frase curta: ");
        frase = tec.nextLine();
        String[] fraseSeparada = frase.split(" ");
        for (int aux=0;aux < fraseSeparada.length;aux++) {
            primeiraLetra = fraseSeparada[aux].substring(0,1).toUpperCase();
            restante = fraseSeparada[aux].substring(1).toLowerCase();
            System.out.print(primeiraLetra+restante+" ");
        }
        tec.close();
    }
}
