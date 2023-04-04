package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Contador extends Funcionario {

    //Sobrescritura del metodo getBonificacion que habia sido heredado de Funcionario
    @Override
    public double getBonificacion() {
        System.out.println("Ejecutando desde contador...");
        //return super.getBonificacion(); // como super hace referencia ala clase padre no me sirve....
        return 200;
    }
    
}
