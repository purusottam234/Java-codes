/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */
public class Constructor {
    private int length;
    private int breadth;
    public Constructor(){
        length= 0;
        breadth= 0;
        
        
    }
    public Constructor(int l,int b){
        length = l;
        breadth = b;
    }
    int findArea(){
        return length * breadth;
    }
    int findPerimeter(){
        return 2*(length+breadth);
    }
    
    
    public static void main(String[] args) {
         Constructor rect1 = new Constructor(10,5);
        Constructor rect2 = new Constructor();
        System.out.println("First Rectangle");
        System.out.println("Area :" + rect1.findArea());
        System.out.println("Perimeter:" + rect1.findPerimeter());
        System.out.println("Second rectangle");
        System.out.println("Area:" + rect2.findArea());
        System.out.println("Perimeter:" + rect2.findPerimeter());
        
        
    }
}
