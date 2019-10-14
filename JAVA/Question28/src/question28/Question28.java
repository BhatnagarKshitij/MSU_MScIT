/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question28;

/**
 *
 * @author Kshitij
 */
public class Question28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();
        MyThread mt3=new MyThread();
        Thread t1=new Thread(mt1);
        Thread t2=new Thread(mt2);
        Thread t3=new Thread(mt3);
        
        t1.setName("MyThread1");
        t1.setPriority(7);
        t1.start();
        System.out.println(t1.getName()+"Currently Running");
        System.out.println(t1.getPriority()+"with Priority");
        t2.start();
        t3.start();


    }
    
}
