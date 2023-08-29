package missao1;

public class Missao1_principal {

    public static void main(String[] args) {

        //apresenta o título da missão
        System.out.println("Início da Missão 1");
        System.out.println("Autor: Adelson Lira");
        System.out.println("Data: 18/08/2023");
        //declara as variáveis
        int notaTrabalho;
        int notaProva;
        int notaBimestre;
        //atribui valor as variáveis
        notaTrabalho = 22;
        notaProva = 58;
        //Realiza a soma (passo 3 da atividade)
        notaBimestre = notaProva + notaTrabalho;
        //Apresenta o resultado da nota bimestral no console (passo 4 da atividade)
        System.out.println("A nota do bimestre é : "+notaBimestre);
    }
}
