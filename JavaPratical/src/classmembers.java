/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */
public class classmembers {
    private int l;
    private int b;
    private int h;
    public void setData(int x ,int y,int z)
    {
        l= x;
        b=y;
        h=z;
    }
    public int findArea()
    {
        return l*b;
    }
    public int findVolume(){
        return l*b*h;
    }
    
    
    
    public static void main(String[] args) {
        classmembers b = new classmembers();
        b.setData(5, 3, 03);
        int area = b.findArea();
        System.out.println("Area of box = " +area);
        int vol = b.findVolume();
        System.out.println("volume of box = " +vol);
        
        
    }
    
}
