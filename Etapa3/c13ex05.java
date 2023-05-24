package AED1.Etapa3;

import java.util.Scanner;

public class c13ex05 {
    public static void main(String[] args) {
        double angulo, seno,cosseno,tangente,arcoSeno,arcoCosseno,arcoTangente;
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um angulo em graus: ");
        angulo = tec.nextDouble();
        angulo = Math.toRadians(angulo);
        seno = Math.sin(angulo);
        cosseno = Math.cos(angulo);
        tangente = Math.tan(angulo);
        arcoSeno = 1/seno;
        arcoCosseno = 1/cosseno;
        arcoTangente = 1/tangente;
        System.out.println("Seno = "+seno);
        System.out.println("Cosseno = "+cosseno);
        System.out.println("Tangente = "+ tangente);
        System.out.println("Arco seno = "+arcoSeno);
        System.out.println("Arco cosseno = "+arcoCosseno);
        System.out.println("Arco tangente = "+arcoTangente);
        tec.close();
    }
}
