package p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno{
    public Suv(String Nombre, String Propietario, int Pasajeros){
        super(Nombre, Propietario, Pasajeros);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es una Suv");
    }

    @Override
    public void combustioninterna() {
        System.out.println("Es un autómovil con combustion interna es una Suv");
    }
    
    @Override
    public void traccion4x4() {
        System.out.println("Es un tipo todo terreno con tracción 4x4 es una Suv");
    }
    
    @Override
    public void chasisIndependiente() {
        System.out.println("Es un tipo todo terreno con chasis independiente es una Suv");
    } 
}
