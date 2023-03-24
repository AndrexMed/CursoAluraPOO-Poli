/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoalurapoo.parte2;

/**
 *
 * @author giova
 */
public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
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
    
    
    public double getBonificacion(){
        if (tipo == 0) {
            return this.salario * 0.1;
        }
        else if (tipo == 1){
            return this.salario;
        }else{
            return 0;
        }
        
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
