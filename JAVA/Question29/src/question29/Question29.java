/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question29;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kshitij
 */
public class Question29 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("To run Join Methiod , Uncomment t2.join in Main method, whereas, to use yeild, uncomment t2.yeild in numberEven class");
        Thread t1=new Thread(new numberEven());
        Thread t2=new Thread(new numberOdd());
        t2.setPriority(10);
        t2.start(); 
 //       t2.join();
        t1.start();     
    }    
}