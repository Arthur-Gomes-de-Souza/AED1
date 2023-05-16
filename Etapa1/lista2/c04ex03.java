package Etapa1.lista2;
import java.util.Scanner;
public class c04ex03 {
    public static void main(String[] args) {
        long menorQuantPol, maiorQuantPol;
        double multa1, multa2, multa3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a menor quantidade de poluente emitido: ");
        menorQuantPol = teclado.nextLong();
        System.out.println("Informe a maior quantidade de poluente emitido: ");
        maiorQuantPol = teclado.nextLong();
        System.out.println("Informe o valor da menor multa: ");
        multa1 = teclado.nextDouble();
        System.out.println("Informe o valor da multa mediana: ");
        multa2 = teclado.nextDouble();
        System.out.println("Informe o valor da multa mais alta: ");
        multa3 = teclado.nextDouble();
        System.out.println("=======================================================================");
        System.out.println("          Quantidade de Poluente Emitido x Valor da Multa");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ate "+ menorQuantPol+ " multa de R$" + multa1);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Acima de "+ menorQuantPol+" ate "+maiorQuantPol+" multa de R$"+multa2);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Acima de "+maiorQuantPol+" multa de R$"+multa3+" por poluente emitido");
        System.out.println("=======================================================================");
        teclado.close();
    }
}
