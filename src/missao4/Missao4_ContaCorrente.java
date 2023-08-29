package missao4;

public class Missao4_ContaCorrente {
    private String nomeCliente;
    private String numeroContaCorrente;
    private double saldo_CC = 0;
    private double limite_CC;

    Missao4_ContaCorrente(){
        System.out.println("Uma conta corrente acabou de ser criada!");
    }

    public Missao4_ContaCorrente(String nomeCliente, double limite_CC) {
        this.nomeCliente = nomeCliente;
        this.limite_CC = limite_CC;
    }

    public void sacar(double valor){
        this.saldo_CC = this.saldo_CC - valor;
        System.out.println("Um saque foi realizado no valor de R$"+valor);
    }

    public void depositar(double valor){
        this.saldo_CC = this.saldo_CC + valor;
        System.out.println("Um depósito foi realizado no valor de R$"+valor);
    }

    public double getSaldo_CC(){
        return this.saldo_CC;
    }

    public double getLimite_CC() {
        return limite_CC;
    }
}
