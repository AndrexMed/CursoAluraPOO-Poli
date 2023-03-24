package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.setNombre("Andres");
        funcionario1.setDocumento("12345");
        funcionario1.setSalario(1000);
        
        System.out.println(funcionario1.getNombre());
    }
}
