package AED1.Etapa2;

import java.util.Scanner;

public class c10ex05 {
    public static void main(String[] args) {
        String sexo;
        double altura, peso, alturaMedHomens, somaAlturaHomens = 0;
        int pessoasPesq = 0, quantMulheres = 0, contMulhPeso = 0, contHomens = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("O valor para interromper a repeticao = 0");

        do {
            System.out.println("Informe sua altura: ");
            altura = teclado.nextDouble();
            if (altura != 0) {
                System.out.println("Informe seu peso: ");
                peso = teclado.nextDouble();
                teclado.nextLine();
                System.out.println("Informe o seu sexo (M para masculino ou F para feminino): ");
                sexo = teclado.nextLine();

                pessoasPesq++;

                if (sexo.equalsIgnoreCase("f")) {
                    quantMulheres++;
                    if (peso < 60) {
                        contMulhPeso++;
                    }
                }

                if (sexo.equalsIgnoreCase("m")) {
                    somaAlturaHomens += altura;
                    contHomens++;
                }
            }

        } while (altura != 0);
        alturaMedHomens = somaAlturaHomens/contHomens;
        System.out.println("Total de pessoas pesquisadas = "+ pessoasPesq);
        System.out.println("Quantidade de mulheres = "+ quantMulheres);
        System.out.println("Altura media dos homens = "+ alturaMedHomens);
        System.out.println("Quantidade de mulheres com peso inferior a 60 = "+ contMulhPeso);
        teclado.close();
    }
}
