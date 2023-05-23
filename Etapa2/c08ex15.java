package AED1.Etapa2;
import java.util.Scanner;
public class c08ex15 {
    public static void main(String[] args) {
        String nome, cargo, nomeMaior = "", cargoMaior = "";
        double salario, somaSalarios = 0, media, maiorSalario = 0;
        int idade, cont18 = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <=2; aux++) {
            System.out.println();
            System.out.println("Informe o seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe o seu cargo: ");
            cargo = teclado.nextLine();
            System.out.println("Informe seu salario: ");
            salario = teclado.nextDouble();
            System.out.println("Informe sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            if (cargo.equalsIgnoreCase("senior")) {
                System.out.println("Senior");
            }
            else {
                System.out.println("Nao e senior");
            }
            if (salario > 10000) {
                System.out.println("Salario maior que R$10 mil");
            }
            else {
                System.out.println("Salario menor que R$10 mil");
            }
            if (idade > 50) {
                System.out.println("Idade maior que 50 anos");
            }
            else {
                System.out.println("Idade menor que 50 anos");
            }
            if (idade <= 18) {
                cont18++;
                somaSalarios += salario;
            }
            if (aux == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }
        media =(float) somaSalarios / cont18;
        System.out.println("A media dos salarios dos funcionarios com ate 18 anos = "+ media);
        System.out.println("O nome e o cargo do funcionário que tem o maior salario = "+ nomeMaior+ " e seu cargo "+ cargoMaior);
        teclado.close();
    }
}
