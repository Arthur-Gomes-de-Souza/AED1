package AED1.Etapa3;

import java.util.Scanner;

public class c13ex02 {
    public static double fx (double x) {
    double fx;
    if (x < 4)
        fx = (5 * x + 3) / (Math.sqrt(16 - Math.pow(x,2)));
    else if (x == 4) {
        fx = 0;
    }
    else
        fx = (5 * x + 3) / (Math.sqrt(Math.pow(x,2) - 16));
    return fx;
    }

    public static void main(String[] args) {
        double x,fx;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.println("Informe o valor de x: ");
            x = tec.nextDouble();
            if (x != -1) {
                fx = fx(x);
                System.out.println("f(x) = "+ fx);
            }
        } while (x != -1);
        tec.close();
    }
}
