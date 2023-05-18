package Etapa2;
import java.util.Scanner;
public class c10ex04 {
    public static void main(String[] args) {
        String nome;
        double custoParcial, custoTotal = 0, bdi, taxaBdi, precoFinal, precoUnit;
        int quantMaterial;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a taxa de BDI da empresa: ");
        taxaBdi = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("O nome para interromper a repeticao = fim");

        do {
            System.out.println("Informe o nome do produto: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("fim"))
                break;
            System.out.println("Informe a quantidade do produto: ");
            quantMaterial = teclado.nextInt();
            System.out.println("Informe o preco unitario do produto: ");
            precoUnit = teclado.nextDouble();
            teclado.nextLine();
            custoParcial = quantMaterial * precoUnit;
            System.out.printf("Custo parcial = R$%.2f", custoParcial);
            custoTotal += custoParcial;
            System.out.println();
        } while (!nome.equalsIgnoreCase("fim"));
        bdi = (custoTotal) * (taxaBdi/100);
        precoFinal = custoTotal + bdi;
        System.out.println("Custo total = "+ custoTotal);
        System.out.println("BDI = "+ bdi);
        System.out.println("Preco final = "+ precoFinal);
        teclado.close();
    }
}
