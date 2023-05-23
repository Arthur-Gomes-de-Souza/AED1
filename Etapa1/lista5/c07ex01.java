package AED1.Etapa1.lista5;
import java.util.Scanner;
public class c07ex01 {
    public static void main(String[] args) {
        String nome;
        int acertos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        nome= teclado.nextLine();
        System.out.println("Informe a quantidade de jogos que voce acertou: ");
        acertos= teclado.nextInt();
        switch (acertos){
            default:
                System.out.println("Nenhum premio.");
                break;
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("Ganha outro cartao.");
                break;
            case 11:
                System.out.println("R$100,00");
                break;
            case 12:
                System.out.println("R$1.000,00");
                break;
            case 13:
                System.out.println("R$50.000,00");
                break;
        }
        teclado.close();
    }
}
