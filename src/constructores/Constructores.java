/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author omar_
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        Persona persona = new Persona();
        Persona juanpersona = new Persona("Juan", 25);
        
        imprimir (persona.getTextoImprime());
        imprimir (juanpersona.getTextoImprime());
         //System.out.println("Nombre:" + (persona.getNombre()));
         
        
    } */
    public static void main(String[] args) {
        Empleado empleado = new Empleado(" Manuel ",20, "Finanza" );
        
        Empleado empleadoCopia = Empleado.copiaEmpleado(empleado);
        //ctrl + space
        empleadoCopia.setDepartamento("ventas");
        
        imprimir (empleado.getTextoImprime());
        imprimir (empleadoCopia.getTextoImprime());
         //System.out.println("Nombre:" + (persona.getNombre()));
         
        
    }
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    public static String convertirATexto(int entero)
    {
        return String.valueOf(entero);
    }
    
    
 }

