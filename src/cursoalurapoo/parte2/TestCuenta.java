package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class TestCuenta {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorros ca = new CuentaAhorros(2, 3);

        cc.depositar(2000); // Deposito dosmil a cc
        cc.transferir(1000, ca); // De cc transfiero mil a ca

        //Prueba de polimorfismo
        ca.depositar(500); // Deposito quinientos a ca
        ca.transferir(100, cc); // Transfiero cien a cc

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
