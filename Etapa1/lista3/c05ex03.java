package Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula o valor a ser retido de Imposto de Renda
public class c05ex03 {
    public static void main(String[] args) {
        double salario, liquido, impRenda;
        long numDepen;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu salario: ");
        salario= teclado.nextDouble();
        System.out.println("Informe o numero de dependentes: ");
        numDepen= teclado.nextLong();
        liquido = salario - numDepen*60.00;
        impRenda = 15.00/100*liquido;
        System.out.println("O valor a ser retirado de Imposto de Renda = "+ impRenda);
        teclado.close();
    }
}
