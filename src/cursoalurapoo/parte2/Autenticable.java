package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public interface Autenticable{ // Una interfaz no puede tener metodos implementados...Toda interfaz es abstracta...Una interfaz no puede heredar de otra clase, Pero si de otra interfaz....
    //No puede tener atributos privados, NO puede tener constructor
    
   //private String clave; Borramos ya que como esta clase es "interfaz" y esta variable es private, 
   //no puede ser accesada porque sus metodos no pueden ser implementados...
    
    public void setClave(String clave);
    
    public boolean iniciarSesion(String clave); //Por defecto en una interfaz todos sus metodos son abstractos...

    

    
}
