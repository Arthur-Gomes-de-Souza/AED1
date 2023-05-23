package AED1.Etapa2;
import java.util.Scanner;
//REVER
public class c08ex20 {
    public static void main(String[] args) {
        int rep;
        double resultado, soma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos: ");
        rep = teclado.nextInt();

        for (int aux = 0; aux<=rep - 1;aux++) {
           resultado = Math.pow(2,aux);
           soma += resultado;
            System.out.println(resultado);
        }
        System.out.println("Soma dos primeiros termos = "+ soma);
        teclado.close();
    }
}
