package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class ControlBonificacion {
    private double suma;
    
    public double registrarSalario(Funcionario funcionario){
        this.suma += funcionario.getBonificacion();
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
    //El codigo compila ya que el parametro que le estamos pidiendo es de tipo Funcionario y las demas clases
    //heredan todos los atributos y comportamientos de Funcionarios...por lo cual no necesita la sobrecarga
    
    //Sobrecarga de metodos
    /*public double registrarSalario(Gerente gerente){
        this.suma += gerente.getBonificacion();
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
    
    //Sobrecarga de metodos
    public double registrarSalario(Contador contador){
        this.suma += contador.getBonificacion();
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }*/
    
}
