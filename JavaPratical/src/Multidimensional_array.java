
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */
public class Multidimensional_array {
    public static void main(String[] args) {
        int a [] = {10,5,19,34,15,34};
        int b[] = new int[6];
        int pos = Arrays.binarySearch(a, 19);
        System.out.println("Index of 19 is : " +pos);
        
        boolean flag = Arrays.equals(a,b);
        System.out.println("Are a and b equal: " +flag);
        
        System.arraycopy(a, 0, b, 0, 6);
        
        System.out.println("******* Elements of b are ******:");
        for (int i = 0;i<6;i++){
            System.out.println(b[i]+" ");
            
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("******* After sorting Elements******");
        for(int i=0;i<6;i++)
            System.out.println(a[i]+ " ");
        
        
    }
    
}
