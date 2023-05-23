package AED1.prova;

import java.util.Scanner;

public class d21358C {
    public static void main(String[] args) {
        int regAcad, quantXerox, codigoCurso;
        double valorProdutos, valorBoleto, mensalidade, custoXerox, valorBolsa;
        String bolsa;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu registro academico: ");
        regAcad = teclado.nextInt();
        System.out.println("Informe a quantidade de copias xerox: ");
        quantXerox = teclado.nextInt();
        System.out.println("Informe o valor total dos produtos adquiridos: ");
        valorProdutos = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Voce tem bolsa? ");
        bolsa = teclado.nextLine();
        //CALCULOS:
        codigoCurso = regAcad / 10000;
        if (codigoCurso == 1) {
            mensalidade = 1200;
        } else {
            if (codigoCurso == 2) {
                mensalidade = 1350;
            } else {
                if (codigoCurso == 3) {
                    mensalidade = 2100;
                } else {
                    mensalidade = 3200;
                }
            }
        }
        if (bolsa.equalsIgnoreCase("Sim")) {
            valorBolsa = 0.05 * mensalidade;
        } else {
            valorBolsa = 0;
        }
        if (quantXerox <= 50) {
            custoXerox = quantXerox * 0.09;
        } else {
            if (quantXerox <= 500) {
                custoXerox = quantXerox * 0.08;
            } else {
                custoXerox = quantXerox * 0.06;
            }
        }
        valorBoleto = mensalidade + custoXerox + valorProdutos - valorBolsa;
        System.out.printf("Valor do boleto: R$ %.2f", valorBoleto);
        teclado.close();
    }
}
