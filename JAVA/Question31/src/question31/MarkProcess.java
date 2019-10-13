/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question31;

import java.util.Scanner;

/**
 *
 * @author Kshitij
 */
public class MarkProcess {

    int number;
    int marks;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getNumber() {
        return number;
    }

    public int getMarks() {
        return marks;
    }

    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Roll Number");
        int roll = sc.nextInt();
        System.out.println("Enter Your Marks");
        int mark = sc.nextInt();
        setNumber(roll);
        setMarks(mark);
    }

    public boolean validate(int mark) {
        if (mark < 0 || mark > 100) {
            try {
                throw new IllegalMarkException("Illegal Mark");
            } catch (IllegalMarkException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return true;
    }

    public void result() {
        if (validate(this.marks)) {
            if (marks < 40) {
                System.out.println("Roll Number"+this.number+" Failed");
            } else {
                System.out.println("Roll Number"+this.number+" Passed");
            }

        }

    }
}
