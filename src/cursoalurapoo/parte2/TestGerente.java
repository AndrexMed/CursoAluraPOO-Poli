package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //gerente.setSalario(5000);
        //Funcionario gerente = new Funcionario();
        gerente.setSalario(10000);
        gerente.setTipo(1);
        gerente.setNombre("Giovanni");
        gerente.setClave("Gio");
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.getNombre());
        System.out.println(gerente.iniciarSesion("Gio"));
    }
}
