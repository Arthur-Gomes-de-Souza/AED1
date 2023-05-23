package AED1.Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula a média ponderada das notas
public class c05ex09 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        nota1 = teclado.nextFloat();
        System.out.println("Informe a segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.println("Informe a terceira nota: ");
        nota3 = teclado.nextFloat();
        media = (nota1 * 2 + nota2 * 3 + nota3 * 5)/(2 + 3 + 5);
        System.out.println("Media final = "+ media);
        teclado.close();
    }
}
