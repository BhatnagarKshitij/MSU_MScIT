/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question13;

/**
 *
 * @author Kshitij
 */
public class Question13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CurrentAccount cust1=new CurrentAccount("Kshitij", 1001, 1500);
        SavingAccount cust2=new SavingAccount("Bhatnagar", 1002, 1200);
        
        cust1.withdraw();
        cust2.withdraw();
    }
    
}
