package missao1;

public class Missao1_DESAFIO2 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 1 - DESAFIO 2 – Cálculo da Média Bimestral");

        int Trab1B, Prova1B, Trab2B,  Prova2B, Nota1B, Nota2B;
        double Media_Final;

        Trab1B = 20;
        Prova1B = 50;
        Trab2B = 15;
        Prova2B = 60;
        Nota1B = Trab1B + Prova1B;
        Nota2B = Trab2B + Prova2B;

        Media_Final = (double) (Nota1B + Nota2B)/2;

        System.out.println("A média final do aluno é : "+Media_Final);
        System.out.println("DESAFIO 2 CONCLUÍDO! – MÉDIA CALCULADA!");

    }
}
