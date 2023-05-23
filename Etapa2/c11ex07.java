package AED1.Etapa2;

import java.util.Scanner;

public class c11ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temperatura,temperaturaMenor=0,temperaturaMaior=0,media,somaTemp=0;
        int conDias=0;
        for (int aux=1;aux<=121;aux++) {
            System.out.println("Informe a temperatura do dia "+aux);
            temperatura = teclado.nextDouble();
            if (aux==1 || temperatura<temperaturaMenor) {
                temperaturaMenor = temperatura;
            }
            if (aux==1 || temperatura>temperaturaMaior) {
                temperaturaMaior = temperatura;
                conDias=0;
            }
            if (temperaturaMaior == temperatura)
                conDias++;
            somaTemp+=temperatura;
        }
        media = (float)somaTemp / 121;
        System.out.println("Menor temperatura = "+temperaturaMenor);
        System.out.println("Maior temperatura = "+temperaturaMaior);
        System.out.println("Media das temperaturas = "+media);
        System.out.println("Quantidade de dias que ocorreu a maior temperatura = "+conDias);
        teclado.close();
    }
}
