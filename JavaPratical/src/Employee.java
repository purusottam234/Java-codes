/*
 * Program demonstrate the single inheritance .
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */

import java.util.*;
class Employee {
    
     int eid;
     String ename;
     float salary;
     void getData()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter id , name and salary");
         eid = sc.nextInt();
         ename = sc.next();
         salary = sc.nextFloat();
         
     }
     void showData(){
         System.out.println("ID:" +eid+"\nName:"+ename+"\nSalary:"+salary);
     }
    
}

class Programmer extends Employee{
    int incentive;
    void getIncentive(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter incentive");
        incentive= sc.nextInt();
        
    }
    void ShowIncentive()
    {
        System.out.println("Incentive:"+incentive);
    }
    public static void main(String[] args) {
        Programmer p= new Programmer();
        p.getData();
        p.getIncentive();
        System.out.println("!!!!!!!!!!!!!! Programmer Details ~!!!!!!!!!!");
        p.showData();
        p.ShowIncentive();
    }
}
