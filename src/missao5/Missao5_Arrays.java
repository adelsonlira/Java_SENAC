package missao5;

import java.util.Scanner;

public class Missao5_Arrays {
    Scanner entrada = new Scanner(System.in);
    public void media_idade_funcionario(){
        int[] idade_funcionarios = new int[6];
        int soma_idade = 0;
        double media_idade = 0;

        for(int i = 0; i < idade_funcionarios.length; i++){
            System.out.println("Digite a idade do funcionário "+(i+1));
            idade_funcionarios[i] = entrada.nextInt();
        }

        System.out.println("----------------");
        int cont = 0;
        while( cont  < idade_funcionarios.length){
            soma_idade += idade_funcionarios[cont];
            cont++;
        }
        System.out.println("A soma das idades é "+soma_idade);

        System.out.println("----------------");
        media_idade = (soma_idade/6);
        System.out.println("A media das idades é "+media_idade);

    }
}
