package Etapa2;
import java.util.Scanner;
public class c08ex22 {
    public static void main(String[] args) {
        int numero, contDiv = 0, primo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero maior que zero: ");
        numero = teclado.nextInt();

        for (int aux = 1; aux <= numero - 1; aux++) {
            primo = numero % aux;
            if (primo == 0) {
                contDiv++;
            }
        }
        if (contDiv > 1) {
            System.out.println("Nao e primo");
        }
        else {
            System.out.println("Ele e primo");
        }
        teclado.close();
    }
}
