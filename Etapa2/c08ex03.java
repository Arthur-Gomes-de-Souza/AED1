package AED1.Etapa2;
import java.util.Scanner;
public class c08ex03 {
    public static void main(String[] args) {
        double nota;
        int faltas, contAprov = 0, contReprov = 0;
        Scanner teclado = new Scanner(System.in);
        for (int cont = 1; cont <=50; cont++) {
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
            }
            else {
                System.out.println("Aluno Reprovado");
                contReprov++;
            }
        }
        System.out.println("Alunos aprovados: "+ contAprov + "\nAlunos reprovados: "+ contReprov);
        teclado.close();
    }
 }
