/*
 * this is a reference that always points to currently active object and can be used 
for name conflict solution when the parameters and instance variables both have same name.
 * To change this template file, choose * and open the template in the editor.
 Tools | Templates
 */

/**
 *
 * @author Purusottam
 */
public class Person {
//    demostration of this keyword
    
    String name ;
    int age ;
    Person(String name , int age){
        this.name=name;
        this.age= age;
    }
    Person(){
        
    }
    boolean CompareAge(Person p){
        if (this.age>p.age)
            return true;
        else
            return false;
    }
    Person min(Person p){
        if (this.age<p.age)
            return this;
        else 
            return p;
        
    }
    
}

class PersonDemo{
    public static void main(String[] args) {
        Person p1 = new Person("Purusottam",23);
        Person p2 = new Person("Tika",23);
        boolean flag = p1.CompareAge(p2);
        if (flag)
            System.out.println("p1 is elder brother");
        else
            System.out.println("P1 is brother");
        
        Person p = new Person();
        p= p1.min(p2);
        System.out.println("Age of the brother is :"+p.age);
        
    }
}
