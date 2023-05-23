package AED1.Etapa2;
import java.util.Scanner;
public class c08ex02 {
    public static void main(String[] args) {
        double nota;
        int faltas;
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
            }
            else {
                System.out.println("Aluno Reprovado");
            }
        }
        teclado.close();
    }
}
