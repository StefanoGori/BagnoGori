/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbagno;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomma
 */
public class bagno {
    
    synchronized void Uomo(){
        System.out.println("è entrato un uomo");
        try {
            Thread.sleep(5000);
            
        } catch (InterruptedException ex) {
            
            Logger.getLogger(bagno.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("l'uomo è uscito dal bagno");
    }
   
    
    
}
