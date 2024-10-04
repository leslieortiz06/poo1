package p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;
    private double Area;
    private double Circunferencia;


    public Circulo() {
    }
    public Circulo(Punto centro, double radio) {
        Centro = centro;
        Radio = radio;
    }
    
    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea() {
        Area = Math.PI * Math.pow(Radio, 2);
        return Area;
    }   
    public double getCircunferencia() {
        Circunferencia = 2 * Radio * Math.PI;
        return Circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }
}
