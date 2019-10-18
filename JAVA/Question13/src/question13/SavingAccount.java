/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question13;

import java.util.Scanner;

/**
 *
 * @author Kshitij
 */
public class SavingAccount extends Account {
int interestRate;
    public SavingAccount(String name, int accNumber, int balance) {
        super(name, accNumber, balance);
        interestRate=12;
    }
        public void displaySavingAccount(){
        System.out.println("-------------------------------------------------------------------------------------");            
        System.out.println("Name : "+name);
        System.out.println("Account Numeber: "+accNumber);
        System.out.println("Current Balance: "+this.balance);
        System.out.println("-------------------------------------------------------------------------------------");

    }
        public void withdraw(){
            int amount;
            Scanner sc=new Scanner(System.in);    
            System.out.println("Enter Amount to withdraw: ");
            amount=sc.nextInt();
            if(this.balance-amount<500){
                System.out.println("Sorry, you cant withdraw money below limit.");
            }
            else{
                this.balance-=amount;
                System.out.println("Money Withdrawn Successfully: ");
                displaySavingAccount();
                calInterestRate();

            }
        }
        public void calInterestRate(){
        int updatedBalance;
        updatedBalance=this.balance+((this.balance*this.interestRate)/100);
        this.balance=updatedBalance;
        System.out.println("Your Balance After interest: "+this.balance);
    }
}
