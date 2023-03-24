package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Gerente extends Funcionario { // Gerente extiende de Funcionario - Aplicando herencia

    private String clave;
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public boolean iniciarSesion(String clave){
        return clave == "Gio";
    }
}
