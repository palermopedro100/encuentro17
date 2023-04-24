/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" 
y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento 
salarial de un empleado en función de su edad y salario actual. El aumento 
salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene
menos de 30 años.
 */
package entidades;

/**
 *
 * @author Pedro
 */
public class Empleado {

    public Empleado(String nombre, int edad, Double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
    private String nombre;
    private int edad;
    private Double salario;
    
    
    public Double calcular_aumento(){
        if (edad>30) {
            return salario*0.10;
            
        }else{
           return salario*0.05;
        } 
    }
    public void aumento(){
        if (edad>30) {
            salario+=salario*0.10;
            
        }else{
           salario+=salario*0.05;
        } 
    }
    
}
