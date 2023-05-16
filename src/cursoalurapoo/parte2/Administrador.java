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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean iniciarSesion(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
