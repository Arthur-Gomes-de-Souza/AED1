package Etapa3;

import java.util.Scanner;

public class c12ex14 {
    public static void main(String[] args) {
        String[] nomeCidade = new String[11], estado = new String[11];
        String tempNome, tempEstado;
        int[] populacao = new int[11];
        int tempPopulacao;
        Scanner tec = new Scanner(System.in);

        for (int aux = 0; aux < nomeCidade.length; aux++) {
            System.out.println("Informe o nome da cidade: ");
            nomeCidade[aux] = tec.nextLine();
            System.out.println("Informe a populacao da cidade: ");
            populacao[aux] = tec.nextInt();
            tec.nextLine();
            System.out.println("Informe o estado da cidade: ");
            estado[aux] = tec.nextLine();
        }
        for (int aux1 = 0; aux1 < nomeCidade.length - 1; aux1++) {
            for (int aux = 0; aux < nomeCidade.length - 1; aux++) {
                if (populacao[aux] < populacao[aux + 1]) {
                    tempPopulacao = populacao[aux];
                    populacao[aux] = populacao[aux + 1];
                    populacao[aux + 1] = tempPopulacao;
                    tempNome = nomeCidade[aux];
                    nomeCidade[aux] = nomeCidade[aux + 1];
                    nomeCidade[aux + 1] = tempNome;
                    tempEstado = estado[aux];
                    estado[aux] = estado[aux + 1];
                    estado[aux + 1] = tempEstado;
                }
            }
        }
        System.out.println("Nome das cidades e dos estados com menor populacao: ");
        for (int aux=0;aux<10;aux++) {
            System.out.println("Cidade: "+nomeCidade[aux]+"   Estado: "+estado[aux]);
        }
        tec.close();
    }
}
