package p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria{
    private double TasaInteres;

    public CuentaDeAhorro(double cantidad, double tasaInteres) {
        super(cantidad);
        TasaInteres = tasaInteres;
    }

    public void calcularInteres(){
        Saldo = Saldo * TasaInteres;
    }

    @Override
    public boolean retira(double cantidad) {
        if (Saldo >= cantidad){
            Saldo = Saldo - cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro [" + super.toString() + ", TasaInteres = " + TasaInteres + "]";
    }

    
}
