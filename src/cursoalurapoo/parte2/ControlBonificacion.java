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
    
    public double registrarSalario(Gerente gerente){
        this.suma += gerente.getBonificacion();
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
}
