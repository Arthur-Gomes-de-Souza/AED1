package Etapa2;
import java.util.Scanner;
//rever outros
public class c08ex31 {
    public static void main(String[] args) {
        String nome, codigo, nomeMenor = "", cargoMenor = "", cargo;
        int rep, contAcimaSalario = 0, contAdmin = 0, contOutros = 0;
        double salarioBruto, salarioMin = 0, salarioAdmin = 0, mediaAdmin, salarioMenor = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de engenheiros pesquisados: ");
        rep = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= rep; aux++) {
            System.out.println("Informe o seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe o seu salario bruto: ");
            salarioBruto = teclado.nextDouble();
            teclado.nextLine();
            System.out.println("Informe o codigo do cargo exercido: ");
            codigo = teclado.nextLine();

            if (codigo.equalsIgnoreCase("c")) {
                salarioMin = 2500;
                cargo = "Engenheiro Calculista";
            }
            else {
                if (codigo.equalsIgnoreCase("p")) {
                    salarioMin = 4650;
                    cargo = "Engenheiro Projetista";
                }
                else {
                    if (codigo.equalsIgnoreCase("o")) {
                        salarioMin = 3200;
                        cargo = "Engenheiro de Obra";
                    }
                    else {
                        if (codigo.equalsIgnoreCase("a")) {
                            salarioMin = 5100;
                            cargo = "Engenheiro Administrador";
                        }
                        else {
                            cargo = "Outros";
                        }
                    }
                }
            }
            if (salarioBruto < salarioMin) {
                System.out.println("ABAIXO DO SALARIO MINIMO");
            }
            if (salarioBruto >= salarioMin) {
                contAcimaSalario++;
            }
            if (codigo.equalsIgnoreCase("a")) {
                salarioAdmin += salarioBruto;
                contAdmin++;
            }
            if (codigo.equalsIgnoreCase("x")) {
                if (salarioBruto > 5000) {
                    contOutros++;
                }
            }

            if (aux == 1 || salarioBruto < salarioMenor) {
                salarioMenor = salarioBruto;
                nomeMenor = nome;
                cargoMenor = cargo;
            }
        }
        mediaAdmin = (float) salarioAdmin / contAdmin;
        System.out.println("Media dos salarios dos Administradores = "+ mediaAdmin);
        System.out.println("Quantidade de salarios acima do mininmo = "+ contAcimaSalario);
        System.out.println("Quantidade de engenheiros de cargo Outros que recebem acima de R$5000 = " + contOutros);
        System.out.println("Nome, cargo e salario do engenheiro de menor salario = "+ nomeMenor+ ", "+ cargoMenor+ " , R$"+ salarioMenor);
        teclado.close();
    }
}
