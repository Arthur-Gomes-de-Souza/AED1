package AED1.Etapa1.lista3;
import java.util.Scanner;
// Funçao: calcular f(x)= x^3 + 4x + 10
public class c05ex01 {
    public static void main(String[] args) {
        double fx, x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        x = teclado.nextDouble();
        fx = Math.pow(x,3) + 4*x + 10;
        System.out.println("f(x) = "+ fx);
        teclado.close();
    }
}
