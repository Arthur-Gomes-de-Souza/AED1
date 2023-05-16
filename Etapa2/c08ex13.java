package Etapa2;
import java.util.Scanner;
public class c08ex13 {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(c08ex13.class.getResourceAsStream("ibge.txt"));
        double percEleitores;
        int contPopulacao = 0, contMulheres = 0, populacaoMenor = 0, populacao, quantEleitores, mulheres, homens;
        String nomeMenor = "", nome;

        for (int aux = 1; aux <= 5; aux++) {
            nome = arquivo.nextLine();
            populacao = arquivo.nextInt();
            quantEleitores = arquivo.nextInt();
            mulheres = arquivo.nextInt();
            homens = arquivo.nextInt();

            if (populacao > homens + mulheres || populacao < homens + mulheres) {
                System.out.println("A soma de homens e mulheres difere da populacao da cidade.");
            }
            percEleitores = (float) (quantEleitores * 100) / populacao;
            System.out.println("Percenual de eleitores = "+ percEleitores + "%");
            System.out.println();
            if (populacao > 1000000) {
                contPopulacao++;
            }
            if (mulheres > homens) {
                contMulheres++;
            }
            if (aux == 1 || populacao < populacaoMenor) {
                nomeMenor = nome;
            }
            arquivo.nextLine();
        }
        System.out.print("Total de cidades com mais de 1 milhao de habitantes = "+ contPopulacao+
                "\nCidades com mais mulheres que homens = "+ contMulheres +
                "\nCidade com menor populacao = "+ nomeMenor);
        arquivo.close();
    }
}
