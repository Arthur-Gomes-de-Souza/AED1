package AED1.Etapa2;
import java.util.Scanner;
public class c08ex29 {
    public static void main(String[] args) {
        int x,y;
        double resultado = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        x = teclado.nextInt();
        System.out.println("Informe o valor de y: ");
        y = teclado.nextInt();

        for (int aux = 1;aux<= y;aux++) {
            resultado *= x;
        }
        System.out.println(resultado);
        teclado.close();
    }
}
