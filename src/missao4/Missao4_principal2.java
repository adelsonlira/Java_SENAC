package missao4;

public class Missao4_principal2 {
    public static void main(String[] args) {

        double saldo_atual, limite_atual;

        Missao4_ContaCorrente CC = new Missao4_ContaCorrente("Paula", 1250);

        limite_atual = CC.getLimite_CC();
        System.out.println("O limite atual da conta é de: R$"+limite_atual);

        saldo_atual = CC.getSaldo_CC();
        System.out.println("O saldo atual da conta é: R$"+saldo_atual);

        CC.depositar(200.50);
        saldo_atual = CC.getSaldo_CC();
        System.out.println("O saldo atual da conta é: R$"+saldo_atual);

        CC.sacar(50.25);
        saldo_atual = CC.getSaldo_CC();
        System.out.println("O saldo atual da conta é: R$"+saldo_atual);

    }
}
