package AED1.Etapa3;

import java.util.Scanner;

public class c13ex07 {
    public static void main(String[] args) {
        String nomeCompleto,ultimoSobrenome;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        nomeCompleto = tec.nextLine();
        String[] nomes = nomeCompleto.split(" ");
        ultimoSobrenome = nomes[nomes.length-1];
        System.out.println("Ultimo sobrenome: "+ultimoSobrenome);
        tec.close();
    }
}
