package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Gerente extends Funcionario implements Autenticable { // Gerente extiende de Funcionario - Aplicando herencia, y como es "Autenticable" le implementamos los metodos de "Autenticable..."
    
    //Sobrescritura de metodos
    public double getBonificacion(){
        System.out.println("Ejecutando desde Gerente...");
        //return this.salario; //No compila con "this" ya que salario es privada, y no hace parte de "este" objeto.
        return 2000; // Con super tenemos acceso a los metodos de la clase padre en este caso Funcionario, y compila
    }

    @Override
    public void setClave(String clave) {
        
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
