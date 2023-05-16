package lista4;
import java.util.Scanner;
public class c06ex07 {
    public static void main(String[] args) {
        double salario, plBruto, impRen, plLiq, valFixo, percentSala;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o salario: ");
        salario = teclado.nextDouble();
        if (salario<=300) {
            valFixo = 500;
            percentSala = 0.70;
        }
        else {
            if (salario<=1000) {
                valFixo = 200;
                percentSala = 0.50;
            }
            else {
                valFixo = 0;
                percentSala = 0.30;
            }
        }
        plBruto = valFixo + percentSala*salario;
        impRen = plBruto*0.25;
        plLiq = plBruto - impRen;
        System.out.printf("PL liquido = %.2f",plLiq);
        teclado.close();
    }
}
