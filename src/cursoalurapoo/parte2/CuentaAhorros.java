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

    //Como este metodo en su clase padre es abstracto me obliga a implementarlo en las clases hijas...
    @Override
    public void depositar(double valor) {
       saldo = this.saldo + valor; //Accede a saldo que esta en Cuenta, ya que esta clase es hija, y saldo esta en "protected"
       
    }
    
}
