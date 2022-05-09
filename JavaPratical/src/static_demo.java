/*
 * Static modifier in java can be used with variables as well as methods. A class basically contains variables and a 
new copy of each variable is created when an object of that class is created or when that class is instiated.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */

class Student{
    String name;
    int roll ;
    String program;
    static int count;
    Student (String n,int r,String p)
    {
        System.out.println("Object Created");
       name = n;
       roll = r;
       program = p;
       count ++;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+roll);
        System.out.println("Program:"+program);
        System.out.println();
        
    }
    
    static void displayCount(){
        System.out.println("Number of Students="+count);
    }
    
}
public class static_demo {
    public static void main(String[] args) {
        
    
    
    Student.displayCount();
    Student x = new Student("Sunil",1,"Csit");
    Student y = new Student("Priya",2,"Csit");
    Student z = new Student("Prabesh",3,"Csit");
    Student.displayCount();
    System.out.println("\n Student Records");
    x.display();
    y.display();
    z.display();
        
    }
    
}
