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
    
    //Sobrescritura de metodos
    public double getBonificacion(){
        System.out.println("Ejecutando desde Gerente...");
        //return this.salario; //No compila con "this" ya que salario es privada, y no hace parte de "este" objeto.
        return super.getSalario() + this.getSalario() * 0.5; // Con super tenemos acceso a los metodos de la clase padre en este caso Funcionario, y compila
    }
}
