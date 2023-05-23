package AED1.Etapa2;
import java.util.Scanner;
public class c09ex03 {
    public static void main(String[] args) {
        double serie = 0, num, den;
        int rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos a serem gerados: ");
        rep = teclado.nextInt();

        for (int aux=1;aux<=rep;aux++) {
            num = 1 + Math.sqrt(4*aux);
            den = 3*aux;
            serie += num / den;
        }
        System.out.println("valor da serie = "+ serie);
        teclado.close();
    }
}
