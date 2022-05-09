/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */
public class multicatch {
    public static void main(String[] args) {
        try 
        {
            int a[] = new int[5];
            a[5] = 30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero !!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array Index!!!");
        }
        catch(Exception e)
        {
            System.out.println("Error " + e);
        }
        System.out.println("REst of the code");
              
    }
    
}
