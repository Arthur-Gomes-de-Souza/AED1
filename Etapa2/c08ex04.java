package Etapa2;
import java.util.Scanner;
public class c08ex04 {
    public static void main(String[] args) {
        String nome;
        int idade, contMaior = 0, contMenor = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 50; aux++) {
            System.out.println("Informe o seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe a sua idade: ");
            idade = teclado.nextInt();
            if (idade > 18) {
                contMaior++;
            }
            else {
                contMenor++;
            }
            teclado.nextLine();
        }
        System.out.println("Alunos com ate 18 anos: "+ contMenor + "\nAlunos acima de 18 anos: "+ contMaior);
        teclado.close();
    }
}
