package AED1.Etapa3;

import java.util.Scanner;

public class c13ex01 {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a coordenada do ponto x1: ");
        x1 = tec.nextInt();
        System.out.println("Informe a coordenada do ponto y1: ");
        y1 = tec.nextInt();
        System.out.println("Informe a coordenada do ponto x2: ");
        x2 = tec.nextInt();
        System.out.println("Informe a coordenada do ponto y2: ");
        y2 = tec.nextInt();
        System.out.println("Distancia = "+ distancia(x1,x2,y1,y2));
        tec.close();
    }
    static double distancia (int x1,int x2, int y1, int y2) {
        double distancia;
        distancia = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        return distancia;
    }
}
