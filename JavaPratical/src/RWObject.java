/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */




import java.io.*;

class Person implements Serializable
{
    private String name ;
    private int age;
    private String gender;
    Person(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @override
    public String toString()
    {
        return "Name="+name+"\nAge="+age+"\nGender="+gender;
    }
}
public class RWObject {
    public static void main(String[] args) {
        Person p1 = new Person("RIta",40,"Female");
        Person p2 = new Person("Lucky",20,"Male");
        try
        {
            FileOutputStream fos = new FileOutputStream(new File("myobject.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream(new File("myobject.txt"));
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            
            Person pr1 = (Person)ois.readObject();
            Person pr2 = (Person)ois.readObject();
            System.out.println(pr1.toString());
            System.out.println(pr2.toString());
            ois.close();
            fis.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not Found");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
