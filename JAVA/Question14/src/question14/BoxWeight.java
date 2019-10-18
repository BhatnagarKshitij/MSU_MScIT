/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question14;

/**
 *
 * @author Kshitij
 */
public class BoxWeight extends Box {
    int weight;

    public BoxWeight(int weight, int height, int width, int depth) {
        super(height, width, depth);
        this.weight = weight;
        calc();
    }
    public void calc(){
        int answer=this.depth+height+weight+weight;
        System.out.println("The Answer is " +this.weight);
    }
    
}
