/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5extra_guia7;

import entidades.Empleado;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1=new Empleado("Juan",29,100.0);
        Empleado e2=new Empleado("Juan",32,100.0);
        
        
        System.out.println(e1.calcular_aumento());
        System.out.println(e2.calcular_aumento());
        
        e1.aumento();
        e2.aumento();
        System.out.println(e1+"\n"+e2);
        
        System.out.println(e1.calcular_aumento());
        
    }
    
}
