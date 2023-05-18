package Etapa2;
import java.util.Scanner;
public class c11ex01 {
    public static void main(String[] args) {
        double fx, media, somaFx=0;
        int rep, contFx=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        rep = teclado.nextInt();

        for (int aux=1;aux<=rep;aux+=2) {
            fx = Math.pow(aux,2) + ((4*aux-2) / 5.0);
            contFx++;
            somaFx += fx;
            System.out.println("f(x) = "+fx);
        }
        media = (float) somaFx/contFx;
        System.out.println("Media de f(x) = "+media);
        teclado.close();
    }
}
