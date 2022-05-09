/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try 
        {
            int a[] = new int[2];
            a[2]= 10;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index!!!!" + e);
        }
        System.out.println("Statement after exception generating statement");
    }
    
}
