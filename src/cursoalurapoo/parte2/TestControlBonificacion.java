package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class TestControlBonificacion {
    public static void main (String[]args){
        //Funcionario Morgan = new Funcionario(); Ya no se puede instanciar porque Funcionario es Abstracta
        
        //En su lugar, se utiliza como una clase BASE para otras clases derivadas que heredan sus caracteristicas y metodos...
        Funcionario Morgan = new Contador(); // Compila ya que es una representacion FISICA y no abstracta de un objeto...
        Morgan.setSalario(2000);
        
        Gerente Niky = new Gerente();
        Niky.setSalario(10000);
        
        Contador Lester = new Contador();
        Lester.setSalario(5000);
        
        ControlBonificacion controlbonificacion = new ControlBonificacion();
        
        controlbonificacion.registrarSalario(Morgan);
        controlbonificacion.registrarSalario(Niky);
        controlbonificacion.registrarSalario(Lester);
    }
}
