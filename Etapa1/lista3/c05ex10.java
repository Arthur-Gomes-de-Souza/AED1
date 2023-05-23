package AED1.Etapa1.lista3;
import java.util.Scanner;
//Função: imprimir o número na vertical
public class c05ex10 {
    public static void main(String[] args) {
        int numInt, n1, n2, n3, n4, n5;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero inteiro de 5 digitos: ");
        numInt = teclado.nextInt();
        n1 = numInt/10000;
        n2 = numInt/1000%10;
        n3 = numInt/100%10;
        n4 = numInt/10%10;
        n5 = numInt%10;
        System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);
        teclado.close();
    }
}
