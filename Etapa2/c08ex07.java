package AED1.Etapa2;
import java.util.Scanner;
public class c08ex07 {
    public static void main(String[] args) {
        String nome;
        int idade, contMenor = 0, contMaior = 0, somaIdade = 0;
        double media;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++) {
            System.out.println("Informe o seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe a sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            if (idade <= 12) {
                contMenor++;
            }
            if (idade >= 30) {
                contMaior++;
            }
            somaIdade += idade;
        }
        media = (float) somaIdade / 5;
        System.out.println("Alunos que tem ate 12 anos = "+ contMenor);
        System.out.println("Alunos que tem acima de 30 anos = "+ contMaior);
        System.out.printf("Media das idades informadas = %.1f", media);
        teclado.close();
    }
}
