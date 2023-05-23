package AED1.Etapa1.lista3;
import java.util.Scanner;
public class c05ex13 {
    public static void main(String[] args) {
        int numero, d1, d2, d3, d4;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um n�mero inteiro de 4 d�gitos: ");
        numero= teclado.nextInt();
        d1= numero/1000;
        d2= numero/100%10;
        d3= numero/10%10;
        d4= numero%10;
        if (d1==d4 && d2==d3){
            System.out.println("O n�mero � um pal�ndromo.");
        }
        else {
            System.out.println("O n�mero n�o � um pal�ndromo.");
        }
        teclado.close();
    }
}
