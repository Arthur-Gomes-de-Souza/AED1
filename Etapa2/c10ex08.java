package AED1.Etapa2;
import java.util.Scanner;
public class c10ex08 {
    public static void main(String[] args) {
        String nomeCidade, cidadeMenor = "";
        int numEleitores, quantMulheres, quantHomens, populacao, contCidade = 0, somaPopu =0, somaEleitores =0,maisMulheres =0, somaHomens =0, popMenor =0;
        double percEleitores, media;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe o nome da cidade: ");
            nomeCidade = teclado.nextLine();
            System.out.println("Informe a populacao do local: ");
            populacao = teclado.nextInt();
            System.out.println("Informe o numero de eleitores: ");
            numEleitores = teclado.nextInt();
            System.out.println("Informe a quantidade de mulheres: ");
            quantMulheres = teclado.nextInt();
            System.out.println("Informe a quantidade de homens: ");
            quantHomens = teclado.nextInt();
            teclado.nextLine();

            if (populacao != quantHomens + quantMulheres) {
                System.out.println("A soma dos homens mais as mulheres e diferente da populacao.");
            }
            contCidade++;
            somaPopu += populacao;
            somaEleitores += numEleitores;
            percEleitores = (float)(100 * somaEleitores) / somaPopu;
            if (quantMulheres>quantHomens)
                maisMulheres++;
            somaHomens += quantHomens;
            if (populacao < popMenor || contCidade == 1){
                popMenor = populacao;
                cidadeMenor = nomeCidade;
            }


        } while (!nomeCidade.equalsIgnoreCase("Zimbabue de Minas"));
        media = (float)somaHomens / contCidade;
        System.out.println("Total de cidades = "+contCidade);
        System.out.println("Populacao total = "+ somaPopu);
        System.out.println("Perrcentual de eleitores = "+ percEleitores+ "%");
        System.out.println("Cidades com mais mulheres que homens = " + maisMulheres);
        System.out.println("Media de homens = "+ media);
        System.out.println("Cidade com menor populacao = "+ cidadeMenor);
        teclado.close();
    }
}
