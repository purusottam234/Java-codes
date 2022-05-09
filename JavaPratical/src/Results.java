/*
 * use of interface for achieving multiple interface.
 */

/**
 *
 * @author Purusottam
 */



interface Sports
{
   float sportWt = 6.06f;
   void showSportWt();
   
    
}

class Test
{
    int roll;
    float part1,part2;
    void setData(int r,float p1, float p2)
    {
        roll = r;
        part1 = p1;
        part2 = p2;
    }
    void showData()
    {
        System.out.println("Roll Number :"+roll);
        System.out.println("Marks obtained");
        System.out.println("Part1= "+part1);
        System.out.println("Part2= "+part2);
             
    }
}
class Results extends Test implements Sports {
    float total;
    public void showSportWt()
    {
        System.out.println("Sports Wt = "+sportWt);
    }
    void display()
    {
        total = part1 + part2 + sportWt;
        showData();
        showSportWt();
        System.out.println("Total Score = "+total);
    }
    public static void main(String[] args) {
        
        Results s1 = new Results();
        s1.setData(12, 27.5f, 56.0f);
        s1.display();

    }
    
}
