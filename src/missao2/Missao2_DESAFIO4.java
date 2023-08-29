package missao2;

     /* Nome: Adelson Lira
        Data: 19/08/2023
      */

public class Missao2_DESAFIO4 {
    public static void main(String[] args) {

        System.out.println("MISSÃO 2 – DESAFIO 4 – WHILE");
        System.out.println("Mostra os números IMPARES de 11 a 40, inclusive os extremos.");

        int numero = 11;

        while (numero <= 40){
            if(numero % 2 != 0){
                System.out.println(numero);
            }
            numero += 3;
        }

        System.out.println("MISSÃO 2 – DESAFIO 4 CONCLUÍDO!");

    }
}
