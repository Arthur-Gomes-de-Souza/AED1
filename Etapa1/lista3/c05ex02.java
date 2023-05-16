package Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula a área da superfície esférica e o volume de uma esfera
public class c05ex02 {
    public static void main(String[] args) {
        double area, volume, raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o raio: ");
        raio = teclado.nextDouble();
        area = 4*3.1416*Math.pow(raio,2);
        volume = 4/3.0*3.1416*Math.pow(raio,3);
        System.out.println("A area da superficie esferica = "+ area);
        System.out.println("O volume da esfera = "+ volume);
        teclado.close();
    }
}
