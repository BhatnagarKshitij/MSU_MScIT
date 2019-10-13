/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question30;

import java.util.Scanner;

/**
 *
 * @author Kshitij
 */
public class sort {

    int data[] = new int[10];

    public void getData() {
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < 10; i++) {
                data[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array length should not be more than 10, remove for loop = for perfect answer" + e.getMessage());
        }
    }

    public void sort() {
        int temp;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(data[i]>data[j]){
                    temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
    }
    public void display(){
        this.sort();
        System.out.println("Data after sorting:");
        for (int i = 0; i < 10; i++) {
                System.out.println(data[i]);
            }
    }
}
