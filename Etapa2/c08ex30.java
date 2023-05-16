package Etapa2;
import java.util.Scanner;
public class c08ex30 {
    public static void main(String[] args) {
        double serie, x , n, conta, somaConta = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        x = teclado.nextDouble();
        System.out.println("Informe o valor de n: ");
        n = teclado.nextDouble();

        for (int aux= 1; aux <= n; aux++) {
            conta = (Math.pow(x,aux) / aux);
            somaConta += conta;
        }
        serie = Math.log(x)+ x + somaConta;
        System.out.println("Serie = "+ serie);
        teclado.close();
    }
}
