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
public class Empleado {
    
     private String nombre;
     private int edad;
     private String departamento;

     public Empleado(
     String nombre,
     int edad, 
     String departamento){
         
         this.nombre = nombre;
         this.edad = edad;
         this.departamento = departamento;
         
     
     }
     //Buscar patrones d diseño de constructores para programacion gozu owo
     public static Empleado copiaEmpleado(Empleado empleadoOld){
         
         return new Empleado(
         empleadoOld.getNombre(),
         empleadoOld.getEdad(),
         empleadoOld.getDepartamento() 
         );
         
     }
     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
     
    public String getTextoImprime(){
        return "Nombre : "
                + this.nombre
                + "\n Edad: "
                + getEdadComoTexto()
                + "\nDep: "
                +this.departamento
                +"\n---------------";
    }
    public String getEdadComoTexto(){
        String edadTexto = Constructores.convertirATexto(edad);
        return edadTexto;
    } 


}
     








     
    

    
    

