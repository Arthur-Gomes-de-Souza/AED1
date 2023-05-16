package Etapa1.lista3;
import java.util.Scanner;
//Função: Calcula a temperatura de Celsius para kelvin e fahrenheit
public class c05ex05 {
    public static void main(String[] args) {
        int celsius, kelvin, fahrenheit;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da temperatura em Celsius: ");
        celsius = teclado.nextInt();
        kelvin = celsius + 273;
        fahrenheit = (celsius * 9 + 160)/5;
        System.out.println("A temperatura em Kelvin = "+ kelvin);
        System.out.println("A temperatura em Fahrenheit = "+ fahrenheit);
        teclado.close();
    }
}
