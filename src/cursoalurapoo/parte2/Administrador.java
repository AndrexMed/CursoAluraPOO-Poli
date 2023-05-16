package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Administrador extends Funcionario implements Autenticable{ // Esta clase es Autenticable...

    @Override //Esta modificando el metodo porque ahora ya esta implementando en su clase Padre...
    public double getBonificacion() {
        return 0;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
    
}
