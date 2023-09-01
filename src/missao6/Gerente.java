package missao6;

public class Gerente extends Funcionario implements ValidaSenha{
    private int senha_ger;
    private String area_ger;

    public double bonificacaoAnual() {
        double salarioComBonificacao = super.bonificacaoAnual();
        salarioComBonificacao = salarioComBonificacao + salarioComBonificacao*0.15;
        return salarioComBonificacao;
    }

    public int getSenha_ger() {
        return senha_ger;
    }

    public void setSenha_ger(int senha_ger) {
        this.senha_ger = senha_ger;
    }

    public String getArea_ger() {
        return area_ger;
    }

    public void setArea_ger(String area_ger) {
        this.area_ger = area_ger;
    }

    public boolean valida(int senha){
        if(this.senha_ger == senha){
            return true;
        }else{
            return false;
        }
    }
}
