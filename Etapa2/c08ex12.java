package AED1.Etapa2;
import java.util.Scanner;
public class c08ex12 {
    public static void main(String[] args) {
        int codigo, quantVendas;
        double precoUnitario, faturamento, somaFaturamento = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 5; aux++) {
            System.out.println("Informe o codigo do modelo vendido: ");
            codigo = teclado.nextInt();
            if (codigo == 1) {
                precoUnitario = 1565;
            }
            else {
                if (codigo == 2) {
                    precoUnitario = 1890;
                }
                else {
                    if (codigo == 3) {
                        precoUnitario = 2150;
                    }
                    else {
                        if (codigo == 4) {
                            precoUnitario = 2963;
                        }
                        else {
                            precoUnitario = 3750;
                        }
                    }
                }
            }
            System.out.println("Informe a quntidade de vendas do produto: ");
            quantVendas = teclado.nextInt();
            faturamento = quantVendas * precoUnitario;
            somaFaturamento += faturamento;
        }
        System.out.printf("O faturamento total do periodo foi = R$%.2f" , somaFaturamento);
        teclado.close();
    }
}
