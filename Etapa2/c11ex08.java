package Etapa2;

import java.util.Scanner;

public class c11ex08 {
    public static void main(String[] args) {
        String nome,funcao,nomeMaior="",funcaoMaior="";
        double valorHora,receber,premioProdut=0,quantHorasTrabalahdas=0,media,somaHoras=0,receberMaior=0,receberTotal=0;
        int contPessoas=0,con1=0,cont2=0,cont3=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da hora trabalhada: ");
        valorHora = teclado.nextDouble();
        teclado.nextLine();
        do {
            System.out.println("Informe o seu nome: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("fim"))
                break;
            System.out.println("Informe a sua funcao: ");
            funcao = teclado.nextLine();
            System.out.println("Informe a quantidade de horas trabalhadas: ");
            quantHorasTrabalahdas = teclado.nextInt();
            teclado.nextLine();
            if (quantHorasTrabalahdas<=100) {
                premioProdut = 1000;
                con1++;
            } else if (quantHorasTrabalahdas<=500) {
                premioProdut = 10*quantHorasTrabalahdas;
                cont2++;
            }
            else {
                premioProdut = 100*(quantHorasTrabalahdas/10);
                cont3++;
            }
            receber = quantHorasTrabalahdas*valorHora+premioProdut;
            System.out.println("Valor a receber: "+receber);
            somaHoras +=quantHorasTrabalahdas;
            contPessoas++;
            if (contPessoas==1 || receber>receberMaior) {
                receberMaior = receber;
                nomeMaior=nome;
                funcaoMaior=funcao;
            }
            receberTotal += receber;
        } while (!nome.equalsIgnoreCase("fim"));
        media = (float)somaHoras / contPessoas;
        System.out.println("Média de horas trabalhadas por pessoa = "+media);
        System.out.println("Nome e funcao da pessoa com maior salario = "+nomeMaior+", "+funcaoMaior);
        System.out.println("Quantidade de pessoas com premio de produtividade de R$1000 = "+con1);
        System.out.println("Quantidade de pessoas com premio de produtividade de R$10 por hora trabalhada = "+cont2);
        System.out.println("Quantidade de pessoas com premio de produtividade de R$100 por cada 10 horas trabalhadas completas = "+cont3);
        System.out.println("Valor total da folha de pagamento = "+receberTotal);
        teclado.close();
    }
}
