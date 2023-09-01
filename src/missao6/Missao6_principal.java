package missao6;

public class Missao6_principal {
    public static void main(String[] args) {
        Funcionario F1 = new Funcionario();

        F1.setNome("Ruan");
        F1.setCpf("123456789-00");
        F1.setSalario(5000);

        Gerente g = new Gerente();

        g.setNome("Alberto");
        g.setCpf("987654321-99");
        g.setSalario(10000);
        g.setSenha_ger(12345);
        g.setArea_ger("CONTAB");

        double bonus_F = F1.bonificacaoAnual();
        double bonus_g = g.bonificacaoAnual();


        System.out.println("DADOS DO GERENTE");
        System.out.println("Nome = "+g.getNome());
        System.out.println("CPF = "+g.getCpf());
        System.out.println("Salário = "+g.getSalario());
        System.out.println("Área = "+g.getArea_ger());
        System.out.println("Bônus = "+bonus_g);

        System.out.println("----------------------------");

        System.out.println("DADOS DO FUNCIONÁRIO");
        System.out.println("Nome = "+F1.getNome());
        System.out.println("CPF = "+F1.getCpf());
        System.out.println("Salário = "+F1.getSalario());
        System.out.println("Bônus = "+bonus_F);
    }
}
