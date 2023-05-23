package AED1.Etapa3;

import java.util.Scanner;

public class c12ex19 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int numSorteado;
        String premio="";
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< numeros.length;aux++) {
            System.out.println("Digite o numero do seu bilhete: ");
            numeros[aux] = tec.nextInt();
        }
        System.out.println("Digite o numero do bilhete sorteado: ");
        numSorteado = tec.nextInt();
        for (int aux=0;aux<numeros.length;aux++) {
            if (numSorteado == numeros[aux]) {
                premio = "Voce foi premiado.";
                break;
            }
            else {
                premio = "Voce nao foi premiado.";
            }
        }
        System.out.println(premio);
        tec.close();
    }
}
