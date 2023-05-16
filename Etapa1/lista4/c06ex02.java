package lista4;
import java.util.Scanner;
public class c06ex02 {
    public static void main(String[] args) {
        double quantPol, multa;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de poluente: ");
        quantPol = teclado.nextDouble();
        if (quantPol<=1500) {
            multa = 0;
        }
        else {
            if (quantPol<=3500)
                multa = 3000;
            else
                multa = 5000*quantPol;
        }
        System.out.printf("Multa = R$%8.2f",multa);
        teclado.close();
    }
}
