package missao3;
/* Autor: Adelson Lira
 * Data: 28/08/2023
 */
public class Missao3_Calculadora {

    private double R;

    public double somar(double N1, double N2){
        return R = N1 + N2;
    }

    public double subtrair(double N1, double N2){
        return R = N1 - N2;
    }

    public double multiplicar(double N1, double N2){
        return R = N1 * N2;
    }

    public double dividir(double N1, double N2) {
        if(N2 != 0){
            return R = N1 / N2;
        }else{
            return 0;
        }
    }
}
