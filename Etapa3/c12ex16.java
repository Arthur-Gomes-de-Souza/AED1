package AED1.Etapa3;

import java.util.Scanner;

public class c12ex16 {
    public static void main(String[] args) {
        double[] numero = new double[10];
        double numReal;
        Scanner tec = new Scanner(System.in);
        for (int aux=0;aux<numero.length;aux++) {
            System.out.println("Informe um numero inteiro: ");
            numero[aux] = tec.nextDouble();
        }
        System.out.println("Digite um numero real: ");
        numReal = tec.nextDouble();
        for (int aux=0;aux<numero.length;aux++) {
            numero[aux] = numero[aux] * numReal;
            System.out.print(numero[aux]+" ");
        }
        tec.close();
    }
}
