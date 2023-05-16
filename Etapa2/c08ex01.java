package Etapa2;
import java.util.Scanner;
public class c08ex01 {
    public static void main(String[] args) {
        double raio, area;
        Scanner teclado = new Scanner(System.in);
        for (int contador = 1; contador<=10; contador++) {
            System.out.println("Informe o raio: ");
            raio = teclado.nextDouble();
            area = 3.1416 * Math.pow(raio,2);
            System.out.println("Area = " + area);
        }
        teclado.close();
    }
}
