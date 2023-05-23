package AED1.Etapa2;
import java.util.Scanner;
public class c10ex07 {
    public static void main(String[] args) {
        int populacao, contDias=0, anos,mes,dias;
        double conta, infectado=1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a populacao da cidade: ");
        populacao = teclado.nextInt();
        do {
            contDias++;
            conta = infectado*0.003;
            infectado += conta;
        } while (infectado<populacao);
        anos = contDias / 365;
        mes = contDias % 365 / 30;
        dias = contDias - ((anos*365)+(mes*30));
        System.out.println("Anos = "+ anos+ " Meses = "+mes+ " Dias = "+dias);
        teclado.close();
    }
}
