package Etapa2;

import java.util.Scanner;

public class c10ex06 {
    public static void main(String[] args) {
        double a,b,c,x,y,reta,distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        a = teclado.nextDouble();
        System.out.println("Informe o valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Informe o valor de C: ");
        c = teclado.nextDouble();
        System.out.println("Para encerrar o programa digite distancia = 0.");

        do {
            System.out.println("Informe a coordenada do ponto Xo: ");
            x = teclado.nextDouble();
            System.out.println("Informe a coordenada do ponto Yo: ");
            y = teclado.nextDouble();
            reta = (a*x) + (b*y) + c;
            distancia = reta / (Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
            System.out.println("D = "+ distancia);

        } while (distancia != 0);
        teclado.close();
    }
}
