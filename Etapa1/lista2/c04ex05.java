package Etapa1.lista2;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class c04ex05 {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner (c04ex05.class.getResourceAsStream("dados.txt"));
          String  nome = arquivo.nextLine();
          String  cpf = arquivo.nextLine();
          String  iden = arquivo.nextLine();
          String  titEleitor = arquivo.nextLine();
          String  cartMot = arquivo.nextLine();
          String  empresa = arquivo.nextLine();
          String  salario = arquivo.nextLine();
            JOptionPane.showMessageDialog(null,
                    "FICHA FUNCIONAL DE: " + nome + "\n\nDocumentos: \nCPF......................... " + cpf +
                            "\nC.I................................ " + iden + "\nTitulo de eleitor.............. " + titEleitor +
                            "\nCarteira de motorista....... " + cartMot + "\n\nEmpresa: " + empresa + "\nSalario: R$" + salario);
            arquivo.close();

    }
}
