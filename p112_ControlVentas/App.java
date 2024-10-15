package p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda mitienda = new Tienda("Copelll", "Carlos Castañeda", "Av México 123");

        mitienda.agregarCliente(new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com"));
        mitienda.agregarCliente(new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com"));
        mitienda.agregarCliente(new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com"));
        mitienda.agregarCliente(new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx"));

        mitienda.getClientes().get(0).agregarVenta(new VentaContado("Martillo", 10, 60.50, 10.00, "Sacabrocados"));
        mitienda.getClientes().get(0).agregarVenta(new VentaCredito("Pala", 2, 1170.55, 3, 10.00));

        mitienda.getClientes().get(1).agregarVenta(new VentaCredito("Clavo", 2, 160.34, 2, 20.00));
        mitienda.getClientes().get(1).agregarVenta(new VentaCredito("Cinta de aislar", 5, 71.34, 6, 20.00));
        mitienda.getClientes().get(1).agregarVenta(new VentaContado("Pinzas", 10, 650.33, 20.00, "Taladro"));
        
        mitienda.getClientes().get(2).agregarVenta(new VentaContado("Thiner", 50, 65.00, 10.00, "Aerosol"));

        System.out.println("\033[H\033[2J");
        mitienda.reporte();

    }
}
