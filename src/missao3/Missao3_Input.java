package missao3;

import java.util.Scanner;

public class Missao3_Input {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase:");
        String texto = entrada.nextLine();

        System.out.println("Digite um número inteiro:");
        int N_int = entrada.nextInt();

        System.out.println("Digite um número real:");
        double N_double = entrada.nextDouble();

        System.out.println("Digite uma Letra ou Palavra:");
        String palavra = entrada.next();

        System.out.println("A frase digitada foi: "+texto);
        System.out.println("O número inteiro digitado foi: "+ N_int);
        System.out.println("O número real foi: "+N_double);
        System.out.println("A Letra ou Palavra digitada foi: "+palavra);

        entrada.close();
    }

}
