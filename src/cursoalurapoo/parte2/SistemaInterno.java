package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class SistemaInterno {
    
    private String clave = "123";
    
    public  boolean Autenticar(Gerente gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login Exitoso!");
            return true;
        }else{
            System.out.println("Error en Login!");
            return false;
        }
    }
    
    //Si quisieramos que el admin tambn pueda iniciar sesion, esto seria mala practica ya que hay copy&paste
    /*public  boolean Autenticar(Administrador admin){
        boolean puedeIniciarSesion = admin.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login Exitoso!");
            return true;
        }else{
            System.out.println("Error en Login!");
            return false;
        }
    }
    
    Funcionario no tiene el metodo iniciarSesion...
    Lo podemos implementar....pero esto haria que todas las clases que heredan tambien
    pueden iniciar sesion en este caso Contador tambien podria iniciarSesion...Pero NO queremos que contador inicie session
    public  boolean Autenticar(Funcionario gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login Exitoso!");
            return true;
        }else{
            System.out.println("Error en Login!");
            return false;
        }
    }
    
    */
    
}
