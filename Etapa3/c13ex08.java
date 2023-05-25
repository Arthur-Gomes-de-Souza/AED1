package AED1.Etapa3;

import java.util.Scanner;

public class c13ex08 {
    public static void main(String[] args) {
        String nomeCompleto, ultimoSobrenome;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe um nome completo: ");
        nomeCompleto = tec.nextLine();
        String[] nomeInteiro = nomeCompleto.split(" ");
        ultimoSobrenome = nomeInteiro[nomeInteiro.length - 1];
        ultimoSobrenome = ultimoSobrenome.toUpperCase();
        System.out.print(ultimoSobrenome + ", ");

        for (int aux = 0; aux < nomeInteiro.length - 1; aux++) {
            System.out.print(nomeInteiro[aux].charAt(0) + ". ");
        }
        tec.close();
    }
}
