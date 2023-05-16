package lista4;
import java.util.Scanner;
public class c06ex04 {
    public static void main(String[] args) {
        String nome;
        double altura, peso, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe a sua altura: ");
        altura = teclado.nextDouble();
        System.out.println("Informe o seu peso: ");
        peso = teclado.nextDouble();
        imc = peso/Math.pow(altura,2);
        if (imc<18) {
            System.out.println(nome+" esta desnutrida(o)");
        }
        else {
            if (imc<20) {
                System.out.println(nome+" esta abaixo do peso");
            }
            else {
                if (imc<25) {
                    System.out.println(nome+" esta no peso ideal");
                }
                else {
                    if (imc<27) {
                        System.out.println(nome+" esta acima do peso");
                    }
                    else {
                        System.out.println(nome+" esta obesa(o)");
                    }
                }
            }
        }
        teclado.close();
    }
}
