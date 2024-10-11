package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo Inicial: " + c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo despues del primer deposito " + c1.getSaldo());
        double cr = 400;
        boolean rsn = c1.retira(cr);
        if (rsn) {
            System.out.println("Retirste " + cr + " efectuado con éxito, nuevo saldo " + c1.getSaldo());
        } else {
            System.out.println("Ni para los cigarros tienes");
        }

        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 1 " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);
        Cliente mujer = new Cliente("Rocio", cliente2.getCuenta());
        mujer.getCuenta().retira(10100);
        System.out.println(cliente2);

        System.out.println("\nProbando clase Banco");
        Banco miBanco = new Banco("Banco del Binestar", "Campus Siglo XXI");
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        miBanco.agregarCliente(mujer);
        miBanco.agregarCliente(new Cliente("Claudia la presi", new CuentaBancaria(100000000)));
        miBanco.getClientes().get(3).getCuenta().retira(30000);
        miBanco.getClientes().get(0).getCuenta().deposita(30000);
        miBanco.getClientes().get(1).getCuenta().deposita(30000);
        miBanco.getClientes().get(2).getCuenta().deposita(30000);
        System.out.println("Los clientes del banco");
        double total = 0;
        for (Cliente cte : miBanco.getClientes()) {
            System.out.println(cte);
            total = total + cte.getCuenta().getSaldo();
        }

        System.out.printf("Total de dinero en el banco %.2f" ,total);
    }
}
