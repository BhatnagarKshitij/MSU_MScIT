/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question25;

import java.util.Scanner;

/**
 *
 * @author Kshitij
 */
public abstract class Product {
    int productId;
    String manufacturerName;
    int basePrice;
    public abstract int salesPrice();
    public void display(){
        System.out.println("Product ID" +this.productId);
        System.out.println("Product ID" +this.manufacturerName);
        System.out.println("Product ID" +this.basePrice);
    }
    
    public void setData(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Product ID: ");
        this.productId=sc.nextInt();
        System.out.println("Enter Manufacture Name: ");
        this.manufacturerName=sc.next();
        System.out.println("Enter Base Price: ");
        this.basePrice=sc.nextInt();
    }
    
  
}
