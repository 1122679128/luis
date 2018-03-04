/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_persona;

/**
 *
 * @author Phoenik
 */
public class Trabajo_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
Persona obj1 = new Persona ();
        
    obj1.setNombre("Duvan ");
    obj1.setApellido("Perdomo");
    obj1.unir();  
           
                     
Persona obj2 = new Persona ();
        
    obj2.setCodigo("582645865");
    obj2.setInfo("Es muy obediente y siempre cumple con su tarea");
           
        System.out.println(obj2.getCodigo());
        System.out.println(obj2.getInfo());
           
                   
    }

  
    }
    

