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
    
    public double getBonificacion(){
        //return this.salario; //No compila ya que salario es privada, y no hace parte de "este" objeto.
        return super.getSalario(); // Con super tenemos acceso a los metodos de la clase padre en este caso Funcionario.
    }
}
