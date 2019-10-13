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
public class numberEven implements Runnable{
    public void printEven(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
        }
    }


    @Override
    public void run() {
        this.printEven();
        
    }
    
    
    
}
