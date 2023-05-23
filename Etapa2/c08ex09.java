package AED1.Etapa2;
import java.util.Scanner;
public class c08ex09 {
    public static void main(String[] args) {
        String nome, sexo;
        int idade, rep, idadeMasc = 0, quantHomem = 0, idadeFem = 0, quantMulher = 0;
        double mediaHomem, mediaMulher;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de pessoas: ");
        rep = teclado.nextInt();
        teclado.nextLine();
        for (int aux = 1; aux <= rep; aux++) {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Informe seu sexo, M para masculino e F para feminino: ");
            sexo = teclado.nextLine();
            if (sexo.equalsIgnoreCase("m")) {
                idadeMasc += idade;
                quantHomem++;
            }
            else {
                idadeFem += idade;
                quantMulher++;
            }
        }
        mediaHomem = (float) idadeMasc / quantHomem;
        mediaMulher = (float) idadeFem / quantMulher;
        System.out.println("Media das idades dos homens = "+ mediaHomem);
        System.out.println("Media das idades das mulheres = "+ mediaMulher);
        teclado.close();
    }
}
