package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Cuenta {
    private double saldo; //Encapsulamiento
    private int agencia; //Encapsulando...
    private int numero;
    private Cliente titular = new Cliente(); // Para hacer referencia de un objeto Cliente con la Cuenta -- Referencia directa
    
    
    private static int countCuentas = 0; //Variable statica (Que no va hacer parte de la instancia sino de la clase)contador de cuentas...
    
    
    
    //Se ejecuta implicitamente -- Aqui personalizamos el constructor que viene por defecto...
    public Cuenta(int agencia, int numero){  // Aqui obligamos que al crear una instacia de cuenta, haya que asignarle un numero para la agencia por medio del constructor
        
        if (agencia <= 0) {
            System.out.println("Error! No se permite valor menor que 0");
            this.agencia = 1; // El this hace refencia a la agencia que esta arriba
        }else{
            this.agencia = agencia; // El this hace refencia a la agencia que esta arriba
            this.numero = numero;
        }
        countCuentas++; //Contador de cuentas...
        System.out.println("Aqui se crea una nueva cuenta: Total de cuentas: "+countCuentas);
    }
    
    //Metodo que no retorna, "void"
    public void depositar(double valor){ //"saldo", is parameter
        this.saldo = this.saldo + valor;
    }
    
    //Metodo que retorna "return"
    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor; // Se Abrevia
            return true;
        }else{
        return false;
        }
    }
    
    public boolean transferir(double valor,Cuenta destino){
        if (this.saldo >= valor) {
            this.retirar(valor); // Correccion de error
            destino.depositar(valor); // Correccion de error
            return true;
        }else{
        return false;
        }
    }
    
    public double getSaldo(){ //Getter - por convencion se usa la palabra "get"
        return this.saldo;
    }
    


    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    public static int getcountCuentas(){   
        //return this.countCuentas; //No se puede usar this ya que el this hace referencia a las instancias, y este atributo es estatico
        return Cuenta.countCuentas;
    }
    
    
}
