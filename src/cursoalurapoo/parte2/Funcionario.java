package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public abstract class Funcionario {
    private String nombre;
    private String documento;
    protected double salario;
    private int tipo;
    
    public Funcionario(){ //Constructor que se crea por defecto de la clase.
        
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Este metodo lo ponemos abstractos ya que cada clase necesita su implementacion de forma diferente.
    //Como el metodo en esta clase no tiene implementacion(reglas de negocio) lo dejamos libre borrando las llaves...
    //Al volver el metodo abstracto obligamos a las clases hijas a sobreescribirlo...para que cada una le de diferente comportamiento.
    public abstract double getBonificacion();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
