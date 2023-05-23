package AED1.Etapa1.lista5;

import java.util.Scanner;

public class c07ex02 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, mediaFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        nota1 = teclado.nextInt();
        System.out.println("Informe a segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.println("Informe a terceira nota: ");
        nota3 = teclado.nextInt();
        mediaFinal = (nota1 + nota2 + nota3) / 3;
        switch (mediaFinal) {
            case 1, 2, 3, 4 -> System.out.println("Conceito E");
            case 5,6 -> System.out.println("Conceito D");
            case 7 -> System.out.println("Conceito C");
            case 8 -> System.out.println("Conceito B");
            default -> System.out.println("Conceito A");
        }
        teclado.close();
    }
}
