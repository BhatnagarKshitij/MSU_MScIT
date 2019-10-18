/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Create a class account that stores customer name, account number and balance. 
From this derive the classes current account and savings account to make them more specific to their requirements.
Current account maintains minimum balance of Rs. 1000, whereas savings account maintains minimum balance of Rs. 500.
The interest rates for current and savings accounts are 5% and 12% respectively.
Include necessary member function in these classes to manage the accounts.
Write main to test these classes.


 */
package question13;

/**
 *
 * @author Kshitij
 */
public class Account {
    String name;
    int accNumber;
    int balance;

    public Account(String name, int accNumber, int balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    
}
