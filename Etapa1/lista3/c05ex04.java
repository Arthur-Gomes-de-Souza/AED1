package Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula a distância entre dois pontos
public class c05ex04 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a coordenada x do ponto 1: ");
        x1 = teclado.nextDouble();
        System.out.println("Informe a coordenada y do ponto 1: ");
        y1 = teclado.nextDouble();
        System.out.println("Informe a coordenada x do ponto 2: ");
        x2 = teclado.nextDouble();
        System.out.println("Informe a coordenada y do ponto 2: ");
        y2 = teclado.nextDouble();
        distancia = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        System.out.println("A distancia entre os pontos 1 e 2 = "+distancia);
        teclado.close();
    }
}
