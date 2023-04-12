package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(int agencia, int numero){
        super(agencia,numero); //Este super llama al metodo constructor de su clase padre
         //Los constructores no se heredan
    }

    //Este metodo esta siendo sobrescrito de la clase padre, no es un metodo nuevo...
    //Polimorfismo...
    @Override
    public boolean retirar(double valor) {
        double comision =  2;
        return super.retirar(valor+comision);
    }
    
    
}
