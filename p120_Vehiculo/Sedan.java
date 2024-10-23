package p120_Vehiculo;

public class Sedan extends Maquina implements Familiar{
    public Sedan(String Nombre, String Propietario, int Pasajeros){
        super(Nombre, Propietario, Pasajeros);
    }
    
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es un Sedan");
    }
    
    @Override
    public void combustioninterna() {
        System.out.println("Es un autómovil con combustion interna es un Sedan");
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es un tipo familiar con carroceria de tres partes es un Sedan");
    }
    
    @Override
    public void chasisMonocasco() {
        System.out.println("Es un tipo familiar con chasis monocasco es un Sedan");
    }    
}
