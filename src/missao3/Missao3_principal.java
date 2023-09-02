package missao3;

/* Autor: Adelson Lira
 * Data: 28/08/2023
 */

import java.util.Scanner;

public class Missao3_principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inicio da Missão 3");

        Missao3_Calculadora obj_calculadora = new Missao3_Calculadora();

        double r_somar;
        double r_subtrair;
        double r_multiplicar;
        double r_dividir;

        System.out.println("Digite o primeiro número");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número");
        double numero2 = entrada.nextDouble();

        r_somar = obj_calculadora.somar(numero1, numero2);
        System.out.println("A resultado da soma é: "+r_somar);

        r_subtrair = obj_calculadora.subtrair(numero1, numero2);
        System.out.println("A resultado da subtração é: "+r_subtrair);

        r_multiplicar = obj_calculadora.multiplicar(numero1, numero2);
        System.out.println("A resultado da multiplicação é: "+r_multiplicar);

        r_dividir = obj_calculadora.dividir(numero1, numero2);
        if(r_dividir == 0){
           System.out.println("A divisão por zero é inválida");
        }else {
            System.out.println("A resultado da divisão é: "+r_dividir);
        }
    }
}
