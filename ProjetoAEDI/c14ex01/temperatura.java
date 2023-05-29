package c14ex01;

import c14ex01.Menu1;

public class temperatura {
    public static void metodotemperatura () {
        int celsius, kelvin, fahrenheit;
        System.out.println("Informe o valor da c14ex01.temperatura em Celsius: ");
        celsius = Menu1.tec.nextInt();
        kelvin = celsius + 273;
        fahrenheit = (celsius * 9 + 160)/5;
        System.out.println("A c14ex01.temperatura em Kelvin = "+ kelvin);
        System.out.println("A c14ex01.temperatura em Fahrenheit = "+ fahrenheit);
    }
}
