/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question29;

/**
 *
 * @author Kshitij
 */
public class numberOdd implements Runnable {

    public void printOdd() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: "+i);
            }
        }
    }

    @Override
    public void run() {
        this.printOdd();

    }

}
