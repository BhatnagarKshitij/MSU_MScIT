package question31;
/**
 * @author Kshitij
 */
public class Question31 {
    public static void main(String[] args) {
        /*
Write a class called MarkProcess to process the marks. Obtain the register number and marks as input. If marks are <0, user defined exception IllegalMarkException is thrown and handled with the message "Illegal Mark". For all valid marks, the candidate will be declared as "PASS", if the marks are>=40. Otherwise it will be declared as Fail.

      In MarkProcess class write a validation(int mark) method which is used to call the exception.

      Write another method result() which will declare the result. 

      Write a class containing main method that will create an object of type MarkProcess and call the methods in it to declare the result
        */
        MarkProcess m1=new MarkProcess();
        m1.set();
        m1.result();
        
    }
    
}
