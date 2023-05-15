package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Administrador extends FuncionarioAutenticable { // En Java solo

    @Override //Esta modificando el metodo porque ahora ya esta implementando en su clase Padre...
    public double getBonificacion() {
        return 0;
    }
    
}
