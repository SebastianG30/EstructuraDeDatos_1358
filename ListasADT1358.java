/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.DoubleLinkedList;
import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author pekenin
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Jose"));
        lsl.append(new String("Diana"));
        lsl.append(new String("Santiago"));
        lsl.append("Daniela");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        // Objetos del tipo Empleado
        
        lsl2.append(new Empleado(1, "Jose", "Garcia", "Perez", 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Juan", "Garcia", "Perez", 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Pancho", "Garcia", "Perez", 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Marco", "Garcia", "Perez", 1850.5f, 2015, 4));
        
        lsl2.transversal();
        
        DoubleLinkedList ldl = new DoubleLinkedList();
        ldl.append(new Integer(10));
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        ldl.transversal();
        
        
    }
    
}
