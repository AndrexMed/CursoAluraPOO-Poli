package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class CuentaAhorros extends Cuenta {
    
    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero); //Este super llama al metodo constructor de su clase padre - 
        //Los constructores no se heredan
    }

    //Probando polimorfismo
    @Override // Sobreescribo el metodo tiene que ser igual (Parametros, etc...)
    public boolean retirar(double valor) {
        double comision = 10;
        return super.retirar(valor + comision);
    }
    
}
