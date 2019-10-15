package org;

import org.*;
import java.util.*;
public class order{
	public String pizzaName;
	
	public void takeOrder(){
		System.out.println("Magenta Pizza, Large Size worth rupee 500");
		this.pizzaName="Magenta";
	}
	public static void main(String args[]){
	pizza p=new pizza();
	p.displayMenu();
		order o=new order();
		o.takeOrder();
}
}
