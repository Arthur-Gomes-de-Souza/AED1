package AED1.Etapa3;

import java.util.Scanner;

public class c13ex04 {
    public static void main(String[] args) {
        double numAleatorio;
        int numero, cont=0;
        Scanner tec = new Scanner(System.in);
        numAleatorio =(int) Math.floor(Math.random() * 100);
        do {
            System.out.println("Tente acertar o numero gerado pelo computador: ");
            numero = tec.nextInt();
            if (numero < numAleatorio) {
                System.out.println("O NUMERO DIGITADO ESTA ABAIXO DO NUMERO GERADO.");
                cont++;
            } else if (numero > numAleatorio) {
                System.out.println("O NUMERO DIGITADO ESTA ACIMA DO NUMERO GERADO.");
                cont++;
            } else {
                System.out.println("VOCE ACERTOU O NUMERO!");
                cont++;
            }
        } while (numero != numAleatorio);
        System.out.println("Tentativas = "+ cont);
    }
}
