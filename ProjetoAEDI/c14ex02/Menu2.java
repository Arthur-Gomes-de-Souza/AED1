package c14ex02;

import java.util.Scanner;

public class Menu2 {
    public static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        double area;
        while (opcao != 9) {
            System.out.println("Selecione a figura geometrica que deseja saber a area: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Triangulo retangulo");
            System.out.println("4 - Circulo");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1: area = FigurasGeometricas.Quadrado();System.out.println("Area = " + area); break;
                case 2: area = FigurasGeometricas.Retangulo();
                    System.out.println("Area = " + area); break;
                case 3: area = FigurasGeometricas.TrianguloRetangulo();System.out.println("Area = " + area); break;
                case 4: area = FigurasGeometricas.Circulo();System.out.println("Area = " + area); break;
                case 9: break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }
        }
        System.out.println("FIM DO PROGRAMA");
        tec.close();
    }
}
