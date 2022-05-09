/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */
public class Throwdemo {
    void divide(int x, int y)
    {
        int r=x/y;
        System.out.println("Quotient =" + r);
    }
    public static void main(String[] args) {
        Throwdemo t = new Throwdemo();
        try
        {
            t.divide(25, 5);
            t.divide(25, 0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    
}
