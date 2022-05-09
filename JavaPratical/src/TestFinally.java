/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */
public class TestFinally {
    public static void main(String[] args) {
        try
        {
            int x = 25/0;
            System.out.println("Quotient= "+ x);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally block is always executed");
        }
        
        System.out.println("rest of code ");
    }
    
}
