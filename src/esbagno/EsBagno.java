/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbagno;

/**
 *
 * @author Tomma
 */
public class EsBagno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Runnable r1= new runnable1();
        Runnable r2= new runnable2();
       
        
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r1);
        Thread t4=new Thread(r2);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
    
}
