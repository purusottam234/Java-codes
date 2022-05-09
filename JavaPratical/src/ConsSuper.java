/*
 * Multiple inheritance with super .
super always refers to the super class.
  
 */

/**
 *
 * @author Purusottam
 */



class Room
{
    int length;
    int breadth;
    Room(int x, int y){
        // super class constructor
        length = x;
        breadth = y;
        
    }
    
    int area()
    {
        return length* breadth;
    }
    
}

class BedRoom extends Room{
    int height;
    BedRoom(int x, int y, int z)
    {
        super(x,y);
        height = z;
    }
    int volume()
    {
        return length*breadth*height;
    }
}
public class ConsSuper {
    public static void main(String[] args) {
        BedRoom br = new BedRoom(5,3,4);
        System.out.println("Area= "+br.area());
        System.out.println("VOlume= "+br.volume());
        
        
    }
}
