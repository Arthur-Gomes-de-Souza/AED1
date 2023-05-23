package AED1.Etapa2;
import java.util.Scanner;
public class c10ex03 {
    public static void main(String[] args) {
        double angulo, setorCirc, raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do angulo: ");
        angulo = teclado.nextDouble();
        System.out.println("O valor oara interromper a repeticao = -1");

        do {
            System.out.println("Informe o valor do raio: ");
            raio = teclado.nextDouble();
            if (raio == -1)
                break;
            setorCirc = (angulo * 3.1416 * Math.pow(raio,2)) / 360;
            System.out.println("S = "+ setorCirc);
        } while (raio != -1);
        teclado.close();
    }
}
