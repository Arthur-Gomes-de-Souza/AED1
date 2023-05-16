package Etapa1.lista2;
import java.util.Scanner;
public class c04ex02 {
    public static void main(String[] args) {
        String nome, cpf, nomeEmpresa, id;
        long cartMotorista, titEleitor;
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome= teclado.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf= teclado.nextLine();
        System.out.println("Informe sua identidade: ");
        id= teclado.nextLine();
        System.out.println("Informe seu titulo de eleitor: ");
        titEleitor= teclado.nextLong();
        System.out.println("Informe sua carteira de motorista: ");
        cartMotorista= teclado.nextLong();
        System.out.println("Informe seu salario: ");
        salario= teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Informe o nome da sua empresa: ");
        nomeEmpresa= teclado.nextLine();
        System.out.println("FICHA FUNCIONAL DE: "+nome);
        System.out.println();
        System.out.println("Documentos:");
        System.out.println("CPF.........................   "+cpf);
        System.out.println("C.I.........................   "+id);
        System.out.println("Titulo de eleitor...........   "+titEleitor);
        System.out.println("Carteira de motorista.......   "+cartMotorista);
        System.out.println();
        System.out.println("Empresa: "+nomeEmpresa);
        System.out.println("Salario: R$ "+salario);
        teclado.close();
    }
}
