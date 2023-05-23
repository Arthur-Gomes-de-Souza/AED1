package AED1.Etapa2;

import java.util.Scanner;

public class c11ex13 {
    public static void main(String[] args) {
        int rep,cont=0;
        double serie=0,num,den;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantos termos tera a serie: ");
        rep = teclado.nextInt();

        do {
            cont++;
            num = cont* Math.pow(cont*9+1,cont*2);
            den = Math.pow(7,cont-1);
            serie += num/den;
        } while (cont <= rep);
        serie = 71 + Math.cbrt(serie);
        System.out.println("Valor da serie = "+serie);
        teclado.close();
    }
}
