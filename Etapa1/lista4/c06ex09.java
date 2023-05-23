package AED1.Etapa1.lista4;
import java.util.Scanner;
public class c06ex09 {
    public static void main(String[] args) {
        double altura, pesoIdeal;
        String sexo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        altura = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Informe o seu sexo, F para feminino e M para masculino: ");
        sexo = teclado.nextLine();
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7*altura-58;
        }
        else {
            pesoIdeal = 62.1*altura-44.7;
        }
        System.out.printf("Peso ideal = %2.3f",pesoIdeal);
        teclado.close();
    }
}
