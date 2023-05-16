package lista4;
import java.util.Scanner;
//FUNÇÃO: CALCULA O VALOR DE F(X)
public class c06ex01 {
    public static void main(String[] args) {
        double x, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        x = teclado.nextDouble();
        if (x<4) {
           fx = (5*x+3)/(Math.sqrt(16-Math.pow(x,2)));
        }
        else {
            if (x == 4)
                fx = 0;
            else
                fx = (5 * x + 3) / (Math.sqrt(Math.pow(x, 2) - 16));
        }
        System.out.println("f(x) = "+fx);
        teclado.close();
    }
}
