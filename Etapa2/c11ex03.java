package AED1.Etapa2;

import java.util.Scanner;

public class c11ex03 {
    public static void main(String[] args) {
        double multa,somaMultas=0;
        int dia,pontos,contMulta=0;
        String placa;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe o dia: ");
            dia = teclado.nextInt();
            if (dia==99)
                break;
            teclado.nextLine();
            System.out.println("Informe a placa: ");
            placa = teclado.nextLine();
            System.out.println("Informe os pontos: ");
            pontos = teclado.nextInt();
            if (pontos==3){
                multa = 42;
            } else if (pontos==5) {
                multa = 108;
            }
            else {
                multa = 479;
            }
            System.out.println("Placa = "+placa);
            System.out.println("Valor da multa = R$"+multa);
            if (pontos==8 && dia<=15) {
                contMulta++;
            }
            somaMultas+=multa;
        }while (dia != 99);
        System.out.println("Quantidade de multas de pontuacao 8 da primeira quinzena do mes = "+contMulta);
        System.out.println("Valor total arrecadado com as multas = R$"+ somaMultas);
        teclado.close();
    }
}
