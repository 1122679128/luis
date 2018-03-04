/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_vehiculo1;

/**
 *
 * @author Phoenik
 */
public class Trabajo_vehiculo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        vehiculo obj1 = new vehiculo();
        
            obj1.setColor("rojo");
            obj1.setPlaca("456 CDN");
            obj1.setNum_llantas(8);
            
                System.out.println(obj1.getColor());
                System.out.println(obj1.getPlaca());
                System.out.println(obj1.getNum_llantas());
                
        vehiculo obj2 = new vehiculo ();
        
            obj2.setModelo("BMW");
            obj2.setInfo("carro cero kilometro con 475 caballos de furza, viene en su nuevo modelo personalizado de ediccion especial");
            
            System.out.println(obj2.getModelo());
            System.out.println(obj2.getInfo());
    }
    
}
