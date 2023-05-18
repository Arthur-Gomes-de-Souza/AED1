package Etapa3;

import java.util.Scanner;

public class c12ex18 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        String nome;
        int posicao = -1;
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< nomes.length;aux++) {
            System.out.println("Informe o nome da pessoa: ");
            nomes[aux] = tec.nextLine();
        }
        // Solicitando o nome a ser pesquisado no vetor
        System.out.println("Informe o nome da pessoa a ser pesquisado: ");
        nome = tec.nextLine();
        // Pesquisando o nome no vetor
        for (int aux=0;aux< nomes.length;aux++) {
            if (nome.equalsIgnoreCase(nomes[aux])) {
                posicao = aux+1;
                break;
            }
        }
        // Informando a posição do nome no vetor
        if (posicao == -1)
            System.out.println("Essa pessoa nao se encontra na fila.");
        else{
            System.out.println(nome+" esta em "+posicao+" na fila.");
        }
        tec.close();
    }
}
