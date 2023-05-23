package AED1.Etapa3;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class c12ex27 {
    public static void main(String[] args) {
        List<String> listaCpf = new ArrayList<String>();
        List<String> listaEndereco = new ArrayList<String>();
        String cpf,endereco,resposta;
        int pos=-1;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.println("Digite o CPF (0 para encerrar): ");
            cpf = tec.nextLine();
            if (cpf.equalsIgnoreCase("0"))
                break;
            listaCpf.add(cpf);
            System.out.println("Digite o endereco: ");
            endereco = tec.nextLine();
            listaEndereco.add(endereco);
        } while (!cpf.equalsIgnoreCase("0"));
        System.out.println("Informe o CPF para pesquisar na lista: ");
        cpf = tec.nextLine();
        // PESQUISA CPF INFORMADO NA LISTA
        for (int aux=0;aux < listaCpf.size();aux++) {
            if (listaCpf.get(aux).equalsIgnoreCase(cpf)) {
                pos = aux;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("CPF nao encontrado!");
            System.out.println("Quer incluir o CPF com um novo endereco (S/N) ?");
            resposta = tec.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                listaCpf.add(cpf);
                System.out.println("Informe o novo endereco: ");
                endereco = tec.nextLine();
                listaEndereco.add(endereco);
                System.out.println("CPF e endereco adicionado a lista!");
            }
        }
        else {
            System.out.println("CPF encontrado na posicao "+(pos+1)+"!");
            System.out.println("Deseja alterar o endereco ou excluir o CPF/endereco (A/E) ?");
            resposta = tec.nextLine();
            if (resposta.equalsIgnoreCase("A")) {
                System.out.println("Informe o novo endereco: ");
                endereco = tec.nextLine();
                listaEndereco.set(pos,endereco);
                System.out.println("Endereco atualizado na lista!");
            }
            else {
                listaCpf.remove(pos);
                listaEndereco.remove(pos);
                System.out.println("CPF e endereco removidos da lista!");
            }
        }
        for (int aux=0;aux < listaCpf.size();aux++) {
            System.out.println(listaCpf.get(aux)+" - "+listaEndereco.get(aux));
        }
        tec.close();
    }
}
