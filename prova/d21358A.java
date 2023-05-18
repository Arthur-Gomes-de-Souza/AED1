// Arthur Gomes de Souza
package prova;

import java.util.Scanner;

public class d21358A {
    public static void main(String[] args) {
        double x, f1, f2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        x = teclado.nextDouble();
        f1 = (2 / 7.0 * Math.pow(x, 2)) + Math.cbrt(4 * Math.pow(x, 5) + 10) - 3;
        f2 = (5 * x - 3) / Math.pow(x - 1, 1 / 7.0) + 6 * x - 1;
        System.out.println("f1(x) = " + f1 + " e f2(x) = " + f2);
        teclado.close();
    }
}
