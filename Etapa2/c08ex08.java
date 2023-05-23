package AED1.Etapa2;
import java.util.Scanner;
public class c08ex08 {
    public static void main(String[] args) {
        double nota, media;
        int faltas, contAprov = 0, somaNota = 0, alunosFaltas16 = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <=50; aux++) {
            System.out.println("Informe a nota final: ");
            nota = teclado.nextDouble();
            if (nota == -1) {
                break;
            }
            System.out.println("Informe o total de faltas: ");
            faltas = teclado.nextInt();
            if (nota >= 65 && faltas <= 16) {
                System.out.println("Aluno Aprovado");
                contAprov++;
                somaNota += nota;
            }
            else {
                System.out.println("Aluno Reprovado");
            }
            if (faltas > 16) {
                alunosFaltas16++;
            }
        }
        media = (float) somaNota / contAprov;
        System.out.println("Media dos alunos aprovados = "+ media);
        System.out.println("Quantidade de alunos com mais de 16 faltas = "+ alunosFaltas16);
        teclado.close();
    }
}
