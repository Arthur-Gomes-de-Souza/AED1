package Etapa2;
import java.util.Scanner;
public class c08ex06 {
    public static void main(String[] args) {
        int numero, contDiv3=0, soma=0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.println("Informe um numero inteiro: ");
            numero = teclado.nextInt();
            if (numero%2==0) {
                System.out.println("O numero informado e par.");
            }
            else {
                System.out.println("O numero informado e impar.");
            }
            if (numero%4==0) {
               soma += numero;
            }
            if (numero%3==0) {
                contDiv3++;
            }
        }
        System.out.println("Soma dos numeros divisiveis por 4 = " + soma);
        System.out.println("Quantidade de numeros divisiveis por 3 = " + contDiv3);
        teclado.close();
    }
}
