package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class TestReferencia {
    public static void main(String[] args) {
        
        //Elemente mas generico puede ser adaptado al elemento mas especifico
        Funcionario funcionario = new Gerente(); //Compila porque todos los gerentes son Funcionarios...
        funcionario.setNombre("Gio");
        funcionario.setSalario(500);
        
        Gerente gerente = new Gerente();
        //Gerente gerente = new Funcionario(); // No compila porque no todos los funcionarios son gerentes
        gerente.setNombre("Aleja");
        gerente.setSalario(1000);
        
        gerente.iniciarSesion("leja");
    }
}
