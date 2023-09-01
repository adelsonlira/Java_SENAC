package missao6;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;


    public double bonificacaoAnual() {
        double salarioComBonificacao = this.salario + this.salario * 0.1;
        return salarioComBonificacao;
    }

    public double bonificacaoAnual(double salario) {
        double salarioComBonificacao;
        if (salario < 1000) {
            salarioComBonificacao = this.salario + this.salario * 0.1 + 100;
        } else {
            salarioComBonificacao = this.salario + this.salario * 0.1;
        }
        return salarioComBonificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
