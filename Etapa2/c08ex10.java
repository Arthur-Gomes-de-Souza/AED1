package Etapa2;
import java.util.Scanner;
public class c08ex10 {
    public static void main(String[] args) {
        String nome, nomeMaior = "";
        double precoUnitario, custoTotal = 0, mediaCustoParcial, custoParcial, custoMaior = 0;
        int quantConsumida, rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o numero de insumos utilizados no projeto: ");
        rep = teclado.nextInt();
        teclado.nextLine();
        for (int aux = 1; aux <= rep; aux++) {
            System.out.println("Informe o nome do insumo: ");
            nome = teclado.nextLine();
            System.out.println("Informe o preco unitario do insumo: ");
            precoUnitario = teclado.nextDouble();
            System.out.println("Informe a quantidade consumida do insumo: ");
            quantConsumida = teclado.nextInt();
            teclado.nextLine();
            custoParcial = quantConsumida * precoUnitario;
            custoTotal += custoParcial;
            if (aux == 1 || custoParcial > custoMaior) {
                custoMaior = custoParcial;
                nomeMaior = nome;
            }
        }
        mediaCustoParcial = (float) custoTotal / rep;
        System.out.printf("Custo total do projeto = %.2f", custoTotal);
        System.out.println();
        System.out.printf("A media dos custos parciais = %.2f", mediaCustoParcial);
        System.out.println();
        System.out.println("O nome do insumo de maior custo parcial = " + nomeMaior);
        teclado.close();
    }
}
