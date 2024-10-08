package p106_Persona;

public class Apoyo extends Persona{
    private String Escolaridad;
    private String Descripcion;
    private double Page;

    public Apoyo() {
    }
    public Apoyo(String nombre, String direccion, int edad, String escolaridad, String descripcion, double page) {
        super(nombre, direccion, edad);
        Escolaridad = escolaridad;
        Descripcion = descripcion;
        Page = page;
    }

    public String getEscolaridad() {
        return Escolaridad;
    }
    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    
    public double getPage() {
        return Page;
    }
    public void setPago(double page) {
        Page = page;
    }

    @Override
    public String toString() {
        return "Apoyo [" + super.toString() + ",Escolaridad=" + Escolaridad + ", Descripcion=" + Descripcion + ", Page =" + Page + "]";
    }  
}
