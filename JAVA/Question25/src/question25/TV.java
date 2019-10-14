/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question25;

/**
 *
 * @author Kshitij
 */
public class TV extends Product{
int commission;
int salesPrice;


    public TV() {
        this.commission=15;
        this.salesPrice=0;
        this.productId=1;
        this.manufacturerName="Kshitij";
        this.basePrice=10000;
    }
    @Override
    public int salesPrice() {
        this.salesPrice=this.basePrice+((this.basePrice*commission)/100);
        return this.salesPrice;
    }
    public void display(){
        System.out.println("Product ID: "+this.productId+" is Manufactured By: "+this.manufacturerName+" and its Selling Prices is :" +this.salesPrice());
    }
    
}
