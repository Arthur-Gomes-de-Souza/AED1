package AED1.Etapa1.lista4;
import java.util.Scanner;
//FUNÇÃO: CALCULA O VALOR DA CONTA DE TV
public class c06ex15 {
    public static void main(String[] args) {
        double conta, valorExtra, diariaPpp, valorTotalPpp, imposto, valorFixo;
        int codigo, quantDias;
        String cidade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o codigo do seu pacote: ");
        codigo = teclado.nextInt();
        System.out.println("Informe a quantidade de dias de consumo de canais pay-per-view: ");
        quantDias = teclado.nextInt();
        System.out.println("Informe o valor dos servicos extras: ");
        valorExtra = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Informe a cidade em que mora: ");
        cidade = teclado.nextLine();
        //CALCULOS:
        if (codigo==1) {
            valorFixo = 65;
            diariaPpp = 1.20;
            if (diariaPpp*quantDias>65) {
                valorTotalPpp = 65;
            }
            else {
                valorTotalPpp = diariaPpp*quantDias;
            }
        }
        else {
            if (codigo==2) {
                valorFixo= 104;
                diariaPpp = 2.10;
                valorTotalPpp= diariaPpp*quantDias;
            }
            else {
                valorFixo= 137;
                valorTotalPpp=0;
            }
        }
        if (cidade.equalsIgnoreCase("Belo Horizonte")) {
            imposto=0;
        }
        else {
            if (cidade.equalsIgnoreCase("Sao Paulo")) {
                imposto=0.01;
            }
            else {
                if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                    imposto=0.015;
                }
                else {
                    imposto=0.02;
                }
            }
        }
        conta=valorFixo+valorTotalPpp+valorExtra+imposto*valorFixo+imposto*valorTotalPpp+imposto*valorExtra;
        System.out.printf("Valor da conta = %.2f",conta);
        teclado.close();
    }
}
