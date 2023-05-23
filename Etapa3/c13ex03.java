package AED1.Etapa3;

import java.util.Scanner;

public class c13ex03 {
    public static void main(String[] args) {
        String numero;
        int posicao;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = tec.nextLine();
        System.out.println("Informe a posicao do numero que deseja saber: ");
        posicao = tec.nextInt();
        System.out.println("Digito = "+ digito(numero,posicao));
        tec.close();
    }
    static String digito (String numero, int posicao) {
        String digito;
        String[] digitos = numero.split("");
        digito = digitos [digitos.length - posicao];
        return digito;

    }
}
