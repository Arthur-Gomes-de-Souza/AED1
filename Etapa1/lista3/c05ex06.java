package AED1.Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula a distância entre um ponto e uma reta
public class c05ex06 {
    public static void main(String[] args) {
        double a, b, c, x, y, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de A na reta: ");
        a = teclado.nextDouble();
        System.out.println("Informe o valor de B na reta: ");
        b = teclado.nextDouble();
        System.out.println("Informe o valor de C na reta: ");
        c = teclado.nextDouble();
        System.out.println("Informe a coordenada de X: ");
        x = teclado.nextDouble();
        System.out.println("Informe a coordenada de Y: ");
        y = teclado.nextDouble();
        distancia = (a * x + b * y + c)/ Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("A distancia entre o ponto e a reta = "+ distancia);
        teclado.close();
    }
}
