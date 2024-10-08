package p108_Vehiculo;

public class Camioneta extends Vehiculo{
    private double Cantidad;
    private int Ejes;
    
    public Camioneta() {
    }

    public Camioneta(String serie, String marca, int año, double precio, double cantidad, int ejes) {
        super(serie, marca, año, precio);
        Cantidad = cantidad;
        Ejes = ejes;
    }

    public double getCantidad() {
        return Cantidad;
    }
    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public int getEjes() {
        return Ejes;
    }
    public void setEjes(int ejes) {
        Ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camioneta [" + super.toString() + ", Cantidad=" + Cantidad + ", Ejes=" + Ejes + "]";
    }
}
