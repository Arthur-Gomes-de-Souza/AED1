package AED1.Etapa2;
import java.util.Scanner;
public class c08ex21 {
    public static void main(String[] args) {
        String situacaoCorporea;
        double altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        altura = teclado.nextDouble();
        System.out.println("Peso         IMC             Situacao Corporea");

        for (int peso = 60; peso <= 100; peso++) {
            imc = peso / Math.pow(altura,2);
            if (imc < 20) {
                situacaoCorporea = "abaixo do peso";
            }
            else {
                if (imc <= 25) {
                    situacaoCorporea = "peso ideal";
                }
                else {
                    situacaoCorporea = "acima do peso";
                }
            }
            System.out.println(peso + "    "+ imc + "    "+ situacaoCorporea);
        }
        teclado.close();
    }
}
