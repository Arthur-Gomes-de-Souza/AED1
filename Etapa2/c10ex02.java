package AED1.Etapa2;
import java.util.Scanner;
public class c10ex02 {
    public static void main(String[] args) {
        double valorRecebido, totalRecebido = 0, media;
        int contValorReceb = 0, contAcimaValor = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("O valor para interromper a repeticao e 0.");
        do {
            System.out.println("Informe o valor recebido: ");
            valorRecebido = teclado.nextDouble();
            if (valorRecebido != 0) {
                totalRecebido += valorRecebido;
                contValorReceb++;
                if (valorRecebido > 1000)
                    contAcimaValor++;
            }
        } while (valorRecebido != 0);
        media = totalRecebido/contValorReceb;
        System.out.println("Valor total recebido = "+ totalRecebido);
        System.out.println("Media dos valores recebidos = "+ media);
        System.out.println("Quantidade de valores acima de R$1000 = "+ contAcimaValor);
        teclado.close();
    }
}
