package missao5;

public class Missao6_tratamento_excecao {
    public void imprimeValores(){
        int num = 20;
        double result;
        for(int i = 5; i > -5; i--){
            try {
                result = num/i;
                System.out.println("O numero "+num+" foi dividido por "+i);
            } catch (Exception e){
                System.out.println("Para i = zero -> valor inválido (divisão por zero)");
            }

        }
    }
}
