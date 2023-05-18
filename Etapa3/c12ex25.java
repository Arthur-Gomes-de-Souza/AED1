package Etapa3;

import java.util.Scanner;

public class c12ex25 {
    public static void main(String[] args) {
        String[] equipe = new String[20];
        String tempEquipe, nomeEquipe,situacao="";
        int[] pontuacao = new int[20];
        int temp,pos=-1;
        Scanner tec = new Scanner(System.in);

        for (int aux=0;aux< equipe.length;aux++) {
            System.out.println("Informe o nome da equipe: ");
            equipe[aux] = tec.nextLine();
            System.out.println("Informe a pontuacao final da equipe: ");
            pontuacao[aux] = tec.nextInt();
            tec.nextLine();
        }
        for (int aux=0; aux<equipe.length-1;aux++) {
            for (int i=0;i< equipe.length-1;i++) {
                if (pontuacao[i] < pontuacao[i+1]) {
                    temp = pontuacao[i];
                    pontuacao[i] = pontuacao[i+1];
                    pontuacao[i+1] = temp;
                    tempEquipe = equipe[i];
                    equipe[i] = equipe[i+1];
                    equipe[i+1] = tempEquipe;
                }
            }
        }
        System.out.println("Informe o nome da equipe a ser pesquisada: ");
        nomeEquipe = tec.nextLine();
        for (int aux=0;aux< equipe.length;aux++) {
            if (nomeEquipe.equalsIgnoreCase(equipe[aux])) {
                pos = aux+1;
            }
        }
        if (pos==-1)
            situacao = "Equipe inexistente.";
        else if (pos<=4) {
            situacao = "Copa Libertadores";
        } else if (pos<=12) {
            situacao = "Copa Sul-americana";
        } else if (pos>=17 && pos<=20) {
            situacao = "Rebaixada";
        }
        System.out.println("posicao da equipe no campeonato = "+pos);
        System.out.println("Situacao da equipe: "+situacao);
        tec.close();
    }
}
