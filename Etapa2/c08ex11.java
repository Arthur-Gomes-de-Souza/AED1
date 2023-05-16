package Etapa2;
import javax.swing.JOptionPane;
public class c08ex11 {
    public static void main(String[] args) {
        String[] botoes1 = {"M","F"};
        String[] botoes2 = {"C","S","O"};
        String[] botoes3 = {"A","C","P","O"};
        String[] botoes4 = {"L","P","C","R"};
        String[] botoes5 = {"1","2","3","4"};
        String nome, idade, salario, nomeMaior = "";
        int escolaridade, sexo, estadoCivil, corOlhos, corCabelo, contMulheres = 0, salarioMaior = 0, salarioMenor = 0;
        double diferencaSalario;

        for (int aux = 1; aux <=3; aux++) {
            nome = JOptionPane.showInputDialog(null,
                    "Informe seu nome: ",
                    "Nome",
                    JOptionPane.INFORMATION_MESSAGE);
            idade = JOptionPane.showInputDialog(null,
                    "Informe sua idade: ",
                    "Idade",
                    JOptionPane.INFORMATION_MESSAGE);
            sexo = JOptionPane.showOptionDialog(null,
                    "Informe seu sexo (M para masculino ou F para feminino): ",
                    "Sexo",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes1,
                    "M");
            estadoCivil = JOptionPane.showOptionDialog(null,
                    "Informe seu estado civil (C para casado, S para solteiro ou O para outros): ",
                    "Estado civil",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes2,
                    "S");
            corOlhos = JOptionPane.showOptionDialog(null,
                    "Informe a cor do seus olhos (A para azul, C para castanhos, P para preto ou O para outros): ",
                    "Cor dos olhos",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes3,
                    "P");
            corCabelo = JOptionPane.showOptionDialog(null,
                    "Informe a cor do seu cabelo (L para loiro, P para preto, C para castanhos ou R para ruivos): ",
                    "Cor do cabelo",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes4,
                    "P");
            salario = JOptionPane.showInputDialog(null,
                    "Informe seu salario: ",
                    "Salario",
                    JOptionPane.INFORMATION_MESSAGE);
            escolaridade = JOptionPane.showOptionDialog(null,
                    "Informe a sua escolaridade (1 para analfabeto, 2 para ensino fundamental, 3 para ensino medio ou 4 para superior): ",
                    "Escolaridade",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes5,
                    "4");
            int idadeInt = Integer.valueOf(idade);
            int salarioInt = Integer.valueOf(salario);
            if (sexo == 1 && corCabelo == 0 && corOlhos == 0 && idadeInt > 18 && idadeInt < 25 && estadoCivil == 1 && salarioInt > 10000 && escolaridade == 3) {
                contMulheres++;
            }
            if (aux == 1 || salarioInt > salarioMaior) {
                nomeMaior = nome;
            }
            if (aux == 1 || salarioInt > salarioMaior && sexo == 0) {
                salarioMaior = salarioInt;
            }
            if (aux == 1 || salarioInt < salarioMenor && sexo == 0) {
                salarioMenor = salarioInt;
            }
        }
        diferencaSalario = salarioMaior - salarioMenor;
        JOptionPane.showMessageDialog(null,
                "Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salario maior que R$10.000,00 e curso superior completo: "+ contMulheres +
                "\nPessoa com maior salario: "+ nomeMaior +
                "\nDiferenca entre o maior e menor salario dos homens: "+ diferencaSalario,
                "Conclusao",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
