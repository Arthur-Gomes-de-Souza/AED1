package lista4;
import java.util.Scanner;
public class c06ex06 {
    public static void main(String[] args) {
        double a, b, c, delta, raiz, raiz1, raiz2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        a = teclado.nextDouble();
        System.out.println("Informe o valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Informe o valor de C: ");
        c = teclado.nextDouble();
        delta = Math.pow(b,2)-4*a*c;
        if (delta>0) {
            raiz1 = (-b + Math.sqrt(delta))/(2*a);
            raiz2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("As raizes da funcao f(x) sao: "+raiz1+" e "+raiz2);
        }
        else {
            if (delta==0) {
                raiz = -b/(2*a);
                System.out.println("A raiz da funcao f(x) e: "+raiz);
            }
            else {
                System.out.println("Nao tem raizes");
            }
        }
        teclado.close();
    }
}
