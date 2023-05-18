package Etapa2;

import java.util.Scanner;

public class c11ex02A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, classificacao, nomeMenor="";
        double valorAplic,media,somaBronze=0,somaAplic=0,aplicacaoMenor=0;
        int contBronze=0,contPrata=0,contOuro=0;

        for (int aux=1;aux<=538;aux++) {
            System.out.println("Informe o seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe o valor aplicado: ");
            valorAplic = teclado.nextDouble();
            teclado.nextLine();
            if (valorAplic <=1000) {
                classificacao = "Bronze";
                contBronze++;
                somaBronze += valorAplic;
            }
            else if (valorAplic<=5000) {
                classificacao = "Prata";
                contPrata++;
            }
            else {
                classificacao = "Ouro";
                contOuro++;
            }
            System.out.println("Nome: "+nome);
            System.out.println("Classificacao: "+ classificacao);
            somaAplic+=valorAplic;
            if (aux==1 || valorAplic<aplicacaoMenor){
                aplicacaoMenor = valorAplic;
                nomeMenor = nome;
            }
        }
        media = (float) somaBronze/contBronze;
        System.out.println("Total de Bronze = "+contBronze);
        System.out.println("Total de Prata = "+contPrata);
        System.out.println("Total de Ouro = "+contOuro);
        System.out.printf("\nMedia das aplicacoes dos clientes Bronze = R$%.2f", media);
        System.out.printf("\nVolume total das aplicacoes = R$%.2f", somaAplic);
        System.out.println("Nome do aplicador de menor aplicacao = "+ nomeMenor);
        teclado.close();
    }
}
