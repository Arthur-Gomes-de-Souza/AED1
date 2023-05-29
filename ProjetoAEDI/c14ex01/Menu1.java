package c14ex01;
import java.util.Scanner;

public class Menu1 {
    public static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("Informe a opcao desejada: ");
            System.out.println("1 - Jogo de adivinhar o numero");
            System.out.println("2 - Calcula area e volume de uma esfera");
            System.out.println("3 - Calcula o raio de um circulo");
            System.out.println("4 - Calcula a distancia entre dois pontos");
            System.out.println("5 - Transforma a c14ex01.temperatura de celsius para fahrenheit e kelvin");
            System.out.println("9 - Sair");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1 : jogo.metodojogo(); break;
                case 2 : areavolumeesfera.metodoareavolumeesfera(); break;
                case 3 : calcularaio.metodocalcularaio(); break;
                case 4 : distanciadoispontos.metododistanciadoispontos(); break;
                case 5 : temperatura.metodotemperatura(); break;
                case 9 : break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }
        }
        System.out.println("FIM DO PROGRAMA");
        tec.close();
    }
}
