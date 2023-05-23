package AED1.Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula o valor do raio
public class c05ex08 {
    public static void main(String[] args) {
        double areaCirc, raio;
        int angulo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da area do setor circular: ");
        areaCirc = teclado.nextDouble();
        System.out.println("Informe o valor do angulo: ");
        angulo = teclado.nextInt();
        raio = Math.sqrt(areaCirc * 360/((float)angulo * 3.1416));
        System.out.println("Raio = "+ raio);
        teclado.close();
    }
}
