package AED1.Etapa3;

import java.util.Scanner;

public class c13ex10 {
    public static void main(String[] args) {
        String nome;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o nome completo: ");
        nome = tec.nextLine();
        String[] nomes = nome.split("");
        for (int aux = 0; aux < nomes.length; aux++) {
            System.out.println(nomes[aux].toUpperCase());
        }
        tec.close();
    }
}
