package AED1.Etapa2;
import java.util.Scanner;
public class c08ex18 {
    public static void main(String[] args) {
        int numero, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero para ser feita a tabuada dele: ");
        numero = teclado.nextInt();
        for (int aux = 1; aux <= 9; aux++) {
            resultado = aux * numero;
            System.out.println(aux+ " x "+ numero + " = "+ resultado);
        }
        teclado.close();
    }
}
