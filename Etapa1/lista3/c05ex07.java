package AED1.Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula o valor da função f(x)
public class c05ex07 {
    public static void main(String[] args) {
        double x, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        x = teclado.nextDouble();
        fx = Math.sqrt(Math.pow(x/4.0 + 1,2) + 1/5.0 * x);
        System.out.println("f(x) = "+ fx);
        teclado.close();
    }
}
