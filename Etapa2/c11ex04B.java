package Etapa2;

import java.util.Scanner;

public class c11ex04B {
    public static void main(String[] args) {
        String nome,sexo,nomeMaior="";
        int idade,pontosPerdidos,somaIdade=0,contCondutores=0,contMasculino=0,mulheresPerdPontos=0,idadeMaior=0;
        double valorMulta, idadeMedia,totalMultas=0,percentHomens;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe o nome do condutor: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("x"))
                break;
            System.out.println("Informe a idade do condutor: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Informe o sexo do condutor: ");
            sexo = teclado.nextLine();
            System.out.println("Informe a quantidade de pontos perdidos na carteira: ");
            pontosPerdidos = teclado.nextInt();
            System.out.println("Informe o valor da multa: ");
            valorMulta = teclado.nextDouble();
            teclado.nextLine();
            contCondutores++;
            somaIdade+= idade;
            totalMultas += valorMulta;
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("masculino")) {
                contMasculino++;
            }
            if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("feminino")) {
                if (pontosPerdidos == 7)
                    mulheresPerdPontos++;
            }
            if (contCondutores==1 || idade>idadeMaior) {
                idadeMaior = idade;
                nomeMaior = nome;
            }
        } while (!nome.equalsIgnoreCase("x"));
        percentHomens = (float)(100*contMasculino) / contCondutores;
        idadeMedia = (float) somaIdade / contCondutores;
        System.out.println("Idade media dos condutores = "+idadeMedia);
        System.out.println("Total das multas aplicadas = "+totalMultas);
        System.out.println("Percentual de homens multados = "+percentHomens+ "%");
        System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira = "+mulheresPerdPontos);
        System.out.println("Nome e idade da pessoa mais velha = "+ nomeMaior+ ", "+idadeMaior+" anos");
        teclado.close();
    }
}
