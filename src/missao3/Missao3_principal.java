package missao3;

/* Autor: Adelson Lira
 * Data: 28/08/2023
 */

public class Missao3_principal {
    public static void main(String[] args) {
        System.out.println("Inicio da Missão 3");

        Missao3_Calculadora obj_calculadora = new Missao3_Calculadora();

        double r_somar;
        double r_subtrair;
        double r_multiplicar;
        double r_dividir;

        r_somar = obj_calculadora.somar(1, 2);
        System.out.println("A resultado da soma é: "+r_somar);

        r_subtrair = obj_calculadora.subtrair(10, 6);
        System.out.println("A resultado da subtração é: "+r_subtrair);

        r_multiplicar = obj_calculadora.multiplicar(3, 6);
        System.out.println("A resultado da multiplicação é: "+r_multiplicar);

        r_dividir = obj_calculadora.dividir(10, 2);
        System.out.println("A resultado da divisão é: "+r_dividir);

    }
}
