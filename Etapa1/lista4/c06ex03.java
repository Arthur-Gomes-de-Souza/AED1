package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex03 {
    public static void main(String[] args) {
        double salario, comissao, vendasMen;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor mensal das vendas: ");
        vendasMen = teclado.nextDouble();
        if (vendasMen<=1000) {
            comissao = 0;
        }
        else {
            if (vendasMen<=10000) {
                comissao = vendasMen*0.10;
            }
            else {
                comissao = 1000;
            }
        }
        salario = 240+comissao;
        System.out.printf("Salario no mes = R$%.2f",salario);
        teclado.close();
    }
}
