package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex08 {
    public static void main(String[] args) {
        String nome;
        double altura, pesoMin, pesoMax;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe a sua altura em metros: ");
        altura = teclado.nextDouble();
        pesoMin = 20*Math.pow(altura,2);
        pesoMax = 25*Math.pow(altura,2);
        System.out.println("Peso minimo = "+pesoMin+" e peso maximo = "+pesoMax);
        teclado.close();
    }
}
