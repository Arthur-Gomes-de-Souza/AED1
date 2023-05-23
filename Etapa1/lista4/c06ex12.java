package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex12 {
    public static void main(String[] args) {
        int bolasProd, bolasDef, bolasTotais, mesesCopa, quantCaixas, quantGalpao;
        double precoCaixa, aluguelMen, custoEmba, custoEstoc, custoTotal;
        //ENTRADA:
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de bolas produzidas: ");
        bolasProd = teclado.nextInt();
        System.out.println("Informe a quantidade de bolas com defeito: ");
        bolasDef = teclado.nextInt();
        System.out.println("Informe o preco unitario das caixas de papelao: ");
        precoCaixa = teclado.nextDouble();
        System.out.println("Informe a quantidade de meses ate a Copa: ");
        mesesCopa = teclado.nextInt();
        System.out.println("Informe o valor mensal do aluguel: ");
        aluguelMen = teclado.nextDouble();
        //CALCULO EMBALAGEM:
        bolasTotais = bolasProd - bolasDef;
        quantCaixas = bolasTotais / 10;
        if (bolasTotais%10>0){
            quantCaixas++;
        }
        custoEmba = quantCaixas * precoCaixa;
        //CALCULO ESTOCAGEM:
        quantGalpao= quantCaixas/850;
        if (quantCaixas%850>0){
            quantGalpao++;
        }
        custoEstoc= quantGalpao*aluguelMen*mesesCopa;
        custoTotal= custoEmba+custoEstoc;
        //SAIDA:
        System.out.printf("Custo total = R$%.2f" , custoTotal);
        teclado.close();
    }
}