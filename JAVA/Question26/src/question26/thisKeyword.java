/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question26;

/**
 *
 * @author Kshitij
 */
public class thisKeyword {
    int number;
    String name;
    String remarks;

    public thisKeyword(int number, String name, String remarks) {
        this.number = number;
        this.name = name;
        this.remarks = remarks;
    }
    
    public void display(){
        System.out.println("Your Number: " +this.number);
        System.out.println("Your Name: " +this.name);
        System.out.println("Remarks: " +this.remarks);
    }
    
}
