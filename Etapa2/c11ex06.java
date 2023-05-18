package Etapa2;

import java.util.Scanner;

public class c11ex06 {
    public static void main(String[] args) {
        int numCanal,numPessoas,contCanal4=0,contCanal7=0,contCanal12=0,totalPessoas=0,numCanalMaisAssis=0;
        double percCanal4,percCanal7,percCanal12,media;
        Scanner teclado = new Scanner(System.in);

        for (int aux=1;aux<=78;aux++) {
            System.out.println("Informe o numero do canal: ");
            numCanal = teclado.nextInt();
            System.out.println("Informe o numero de pessoas que estavam assistindo: ");
            numPessoas = teclado.nextInt();
            if (numCanal==4) {
                contCanal4+=numPessoas;
            } else if (numCanal==7) {
                contCanal7+=numPessoas;
            }
            else {
                contCanal12+=numPessoas;
            }
            totalPessoas+=numPessoas;
            if (contCanal4>contCanal7 && contCanal4>contCanal12) {
                numCanalMaisAssis=4;
            } else if (contCanal7>contCanal4 && contCanal7>contCanal12) {
                numCanalMaisAssis=7;
            }
            else {
                numCanalMaisAssis=12;
            }
        }
        percCanal4 = (float)(100*contCanal4) / totalPessoas;
        percCanal7 = (float)(100*contCanal7) / totalPessoas;
        percCanal12 = (float)(100*contCanal12) / totalPessoas;
        media = (float)totalPessoas / 78;
        System.out.println("Audiencia total do canal 4 = "+contCanal4);
        System.out.println("Audiencia total do canal 7 = "+contCanal7);
        System.out.println("Audiencia total do canal 12 = "+contCanal12);
        System.out.println("Porcentagem de audiencia do canal 4 = "+percCanal4);
        System.out.println("Porcentagem de audiencia do canal 7 = "+percCanal7);
        System.out.println("Porcentagem de audiencia do canal 12 = "+percCanal12);
        System.out.println("Numero do canal mais assistido = "+numCanalMaisAssis);
        System.out.println("Media de pessoas que estavam assistindo = "+media);
        teclado.close();
    }
}
