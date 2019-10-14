/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question27;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kshitij
 */
public class table {
    public void display(){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ; ");
        number=sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(number+"X"+i+"="+ number*i);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("Error"+ex.getMessage());
        }
        
        System.out.println("Enter Number ; ");
        number=sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(number+"X"+i+"="+ number*i);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("Error"+ex.getMessage());
        }
        
        System.out.println("Enter Number ; ");
        number=sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(number+"X"+i+"="+ number*i);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("Error"+ex.getMessage());
        }
    }
}
