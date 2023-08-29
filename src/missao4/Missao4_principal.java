package missao4;

/* Autor: Adelson Lira
 * Data: 29/08/2023
 */

import java.util.Scanner;

public class Missao4_principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome_Autor;
        String Data_Codigo;
        nome_Autor = "Adelson";
        Data_Codigo = "29/08/2023";
        String Msg_inicial = "Início da Missão4!";
        System.out.println(Msg_inicial);
        System.out.println("Este código foi desenvolvido por "+nome_Autor+" em "+Data_Codigo);

        System.out.println("----------------------");
        System.out.println("Verificando o comprimento da String");

        String nome = "Luiz";
        int tamanho = nome.length();
        System.out.println("O tamanho da variável nome é "+ tamanho);

        System.out.println("----------------------");
        System.out.println("Verificando se duas Strings são iguais (maneira 1)");

        String nome_cadastrado = "Luiz";
        String nome_digitado;
        System.out.println("Digite o seu nome:");
        nome_digitado = entrada.next();
        if(nome_cadastrado.equals(nome_digitado)){
            System.out.println("Os nomes são iguais!");
        }else{
            System.out.println("Os nomes são diferentes!");
        }

        System.out.println("----------------------");
        System.out.println("Verificando se duas Strings são iguais (maneira 2)");
        System.out.println("----------------------");
        String nome_cadastrado1 = "Luiz";
        String nome_cadastrado2 = "LUIZ";
        if (nome_cadastrado1.equalsIgnoreCase(nome_cadastrado2)){
            System.out.println("Os nomes são iguais!");
        }else{
            System.out.println("Os nomes são diferentes!");
        }

        System.out.println("----------------------");
        System.out.println("Identificando um caractere numa determinada posição");
        System.out.println("----------------------");
        String Nome = "Luiz";
        System.out.println("A primeira letra do nome é: "+Nome.charAt(0));
        for (int i = 0; i < Nome.length(); i++){
            System.out.println(Nome.charAt(i));
        }


    }
}
