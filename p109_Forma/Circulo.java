package p109_Forma;

public class Circulo extends Forma{
    private double Radio;

    public Circulo() {
    }
    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(Radio, 2);
    }
    public double getPerimetro() {
        return (2 * Radio * Math.PI);
    }

    @Override
    public String toString() {
        return "Circulo [" + super.toString() + ", Radio=" + Radio + "]";
    }
    
}
