/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question23;

/**
 *
 * @author Kshitij
 */
public class Question23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        popcorn pop=new popcorn() {
           
            public void Question23() {
                System.out.println("Awesome Taste!!");
            }
        };
        pop.taste();
        pop.getClass().getName();
   }
    
}
