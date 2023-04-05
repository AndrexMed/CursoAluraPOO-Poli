package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Cliente {
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
    
    
}
