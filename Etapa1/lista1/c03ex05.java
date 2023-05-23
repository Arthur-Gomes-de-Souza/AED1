package AED1.Etapa1.lista1;
import java.util.Scanner;
public class c03ex05 {
    public static void main(String[] args) {
        String nome;
        int anoNasc, anoAtual, idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite o ano em que voce nasceu: ");
        anoNasc = teclado.nextInt();
        System.out.println("Digite o ano em que estamos: ");
        anoAtual = teclado.nextInt();
        idade = anoAtual - anoNasc;
        System.out.println(nome+", voce tem/tera " +idade+" anos em "+ anoAtual);
        teclado.close();

    }
}
