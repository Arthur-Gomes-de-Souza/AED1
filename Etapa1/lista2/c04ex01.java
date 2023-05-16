package Etapa1.lista2;
import java.util.Scanner;
public class c04ex01 {
    public static void main(String[] args) {
        String nome, nomeMeio, sobrenome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu primeiro nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe seu nome do meio: ");
        nomeMeio = teclado.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = teclado.nextLine();
        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();
        System.out.println(sobrenome+", "+nome+" "+nomeMeio);
        System.out.println("Idade: "+idade+" anos");
        teclado.close();
    }
}
