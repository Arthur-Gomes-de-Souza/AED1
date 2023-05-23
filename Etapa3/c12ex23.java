package AED1.Etapa3;

import java.util.Scanner;

public class c12ex23 {
    public static void main(String[] args) {
        String[] placas = new String[100], nome = new String[100];
        String placa;
        int vaga=-1;
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< placas.length;aux++) {
            System.out.println("Digite a placa do carro: ");
            placas[aux] = tec.nextLine();
            System.out.println("Informe o nome do dono da vaga: ");
            nome[aux] = tec.nextLine();
        }
        System.out.println("Digite a placa do carro ou o nome da pessoa que voce quer identificar a vaga:");
        placa = tec.nextLine();
        for (int aux=0;aux< placas.length;aux++) {
            if (placa.equalsIgnoreCase(placas[aux]) || placa.equalsIgnoreCase(nome[aux])) {
                vaga = aux;
            }
        }
        if (vaga==-1) {
            System.out.println("Nao existe esta vaga.");
        }
        else {
            System.out.println("Numero da vaga = " + vaga);
            tec.close();
        }
    }
}
