package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Cliente implements Autenticable{ //Autenticable ya no es una clase, Por eso ya no se puede heredar con "extends", cambiamos por "implements"
    private String nombre;
    private String documento;
    private String telefono;

    //En los metodos puedo agregar condiciones o reglas del negocio....
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    //Como la clase padre es interfaz, nos obliga a implementar sus metodos ya que son abstractos...
    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

    @Override
    public void setClave(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
