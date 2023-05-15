package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();
        
        sistema.Autenticar(gerente1);
        sistema.Autenticar(admin);
    }
}
