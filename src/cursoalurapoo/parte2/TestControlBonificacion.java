package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class TestControlBonificacion {
    public static void main (String[]args){
        Funcionario Morgan = new Funcionario();
        Morgan.setSalario(2000);
        
        Gerente Niky = new Gerente();
        Niky.setSalario(10000);
        
        ControlBonificacion controlbonificacion = new ControlBonificacion();
        
        controlbonificacion.registrarSalario(Morgan);
        controlbonificacion.registrarSalario(Niky);
    }
}
