package AED1.Etapa2;

import java.util.Scanner;

public class c11ex09 {
    public static void main(String[] args) {
        String nome,setorMaior="",nomePrimeiro="",nomeUltimo="";
        int rf,codigo,cont1=0,cont2=0,cont3=0,cont4=0,cont10=0,admissao,ano,anoMenor=100,admissaoMenor=999,anoMaior=0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.println("Informe o seu registro funcional: ");
                rf = teclado.nextInt();
                teclado.nextLine();
                codigo=rf%10000/1000;
                ano=rf/10000;
                if (ano<10 || ano >14 || codigo >4) {
                    System.out.println("REGISTRO INVALIDO.");
                }
                if (codigo==1 && ano<=23 && ano>=10){
                    cont1++;
                } else if (codigo==2 && ano<=23 && ano >=10) {
                    cont2++;
                } else if (codigo==3 && ano<=23 && ano>=10) {
                    cont3++;
                } else if (codigo==4 && ano<=23 && ano >=10) {
                 cont4++;
                }

                if (ano==10 && codigo==2){
                    cont10++;
                }

                if (cont1>cont2 && cont1>cont3 && cont1>cont4){
                    setorMaior ="Gerencia";
                } else if (cont2>cont1 && cont2>cont3 && cont2>cont4) {
                    setorMaior = "Administracao";
                } else if (cont3>cont1 && cont3>cont2 && cont3>cont4) {
                    setorMaior = "Pesquisa";
                }else {
                    setorMaior = "Obras";
                }

                admissao = rf%1000;
                if (ano<=anoMenor && admissao<admissaoMenor) {
                    anoMenor = ano;
                    admissaoMenor=admissao;
                    nomePrimeiro=nome;
                }
                if (ano>=anoMaior && ano<=23){
                    anoMaior=ano;
                    nomeUltimo=nome;
                }
            }
        } while (!nome.equalsIgnoreCase("fim"));
        System.out.println("Funcionarios por setor:\nGerencia = "+cont1+"\nAdministracao = "+cont2+
                "\nPesquisa = "+cont3+"\nObras = "+cont4);
        System.out.println("Entraram em 2010 na Administracao = "+cont10);
        System.out.println("Setor que tem mais funcionarios = "+setorMaior);
        System.out.println("Funcionario mais antigo = "+nomePrimeiro);
        System.out.println("Funcionario mais novo = "+nomeUltimo);
        teclado.close();
    }
}
