package AED1.Etapa3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class c12ex28 {
    public static void main(String[] args) {
        List<String> listaRa = new ArrayList<String>();
        List<String> listaNome = new ArrayList<String>();
        String ra="",nome,tempNome,tempRa;
        int pos=-1;
        Scanner tec = new Scanner(System.in);
        for (int aux=0;aux<4;aux++) {
            System.out.println("Digite o registro academico: ");
            ra = tec.nextLine();
            listaRa.add(ra);
            System.out.println("Informe o nome do aluno: ");
            nome = tec.nextLine();
            listaNome.add(nome);
        }
        // ORDENAR AS DUAS LISTAS PELO NOME EM ORDEM ALFABETICA
        for (int aux=0;aux< listaNome.size()-1;aux++) {
            for (int aux1=0;aux1< listaNome.size()-1;aux1++) {
                if (listaNome.get(aux1).compareToIgnoreCase(listaNome.get(aux1+1)) > 0){
                    tempNome = listaNome.get(aux1);
                    listaNome.set(aux1, listaNome.get(aux1+1));
                    listaNome.set(aux1+1,tempNome);
                    tempRa = listaRa.get(aux1);
                    listaRa.set(aux1, listaRa.get(aux1+1));
                    listaRa.set(aux1+1,tempRa);
                }
            }
        }
        //PESQUISA
        System.out.println("Informe o nome do aluno que quer pesquisar: ");
        nome = tec.nextLine();
        for (int aux=0;aux< listaNome.size();aux++) {
            if (listaNome.get(aux).equalsIgnoreCase(nome)) {
                pos = aux+1;
                ra = listaRa.get(aux);
                break;
            }
        }
        if (pos == -1) {
            System.out.println("NOME NAO ENCONTRADO.");
        }
        else {
            System.out.println("Registro academico: "+ra);
            System.out.println("Posicao na lista: "+pos);
        }
        tec.close();
    }
}
