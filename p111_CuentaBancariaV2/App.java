package p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        // Creamos Banco 
        Banco mibanco = new Banco("Banco del Norte SA de CV", "Privada las Cumbres 123");
        System.out.print("\033[H\033[2J");

        // Agregamos clientes al banco 
        mibanco.agregarCliente(new Cliente("Carlos Fuentes"));
        mibanco.agregarCliente(new Cliente("Juan de la Fuente"));
        mibanco.agregarCliente(new Cliente("Rene Mayorga"));
        mibanco.agregarCliente(new Cliente("Maria Vazquez"));
        System.out.println("\n>>> Los clientes del banco son: \n");
        mibanco.reporte();

        // Agregamos cuentas de diferentes tipos a los clientes del Banco
        mibanco.getClientes().get(0).agregarCuentas(new CuentaDeAhorro(1000, 0.10));
        mibanco.getClientes().get(0).agregarCuentas(new CuentaDeAhorro(1000, 0.20));
        mibanco.getClientes().get(0).agregarCuentas(new CuentaDeCheques(1000, 500));
        mibanco.getClientes().get(1).agregarCuentas(new CuentaDeCheques(2500, 500));
        mibanco.getClientes().get(2).agregarCuentas(new CuentaDeCheques(2000, 600));
        mibanco.getClientes().get(2).agregarCuentas(new CuentaDeAhorro(2000, 0.40));
        System.out.println("\n>>> Los clientes con sus cuentas y saldos iniciales son: \n");
        mibanco.reporte();

        // Retiramos y depositamos a las diferentes cuentas de algunos clientes
        mibanco.getClientes().get(0).getCuentas().get(0).retira(500);
        mibanco.getClientes().get(0).getCuentas().get(1).retira(100);
        mibanco.getClientes().get(1).getCuentas().get(0).retira(100);
        mibanco.getClientes().get(2).getCuentas().get(0).retira(300);
        mibanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        System.out.println("\n>>> Los clientes con sus cuentas y saldos depues de los movimientos son: \n");
        mibanco.reporte();

        // Reporte de clientes del banco y el saldo de sus cuentas, despues del cálculo de intereses
        mibanco.calcularInteres();
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues del cálculo de interes");
        mibanco.reporte();
    }
}
