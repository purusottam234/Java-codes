/*
 *  Program to demonstrate MultiThreading.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Purusottam
 */


class RunnableDemo implements Runnable
{
    String tname;
    RunnableDemo(String n )
    {
        tname = n;
        System.out.println("Creating :"+tname);
    }
    public void run()
    {
        System.out.println("Running: "+tname);
    
    try 
    {
        for(int i = 4;i>0;i--)
        {
            System.out.println("Thread:" + tname + " printing:" +i);
            Thread.sleep(50);
        }
        
    }
    catch(InterruptedException e)
    {
        System.out.println("Thread " + tname +"Interrupted");
        
    }
        System.out.println("Thread: "+tname+"exiting");
    
    }
     
         
}
public class TestThread {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("one");
        Thread t1 = new Thread(R1);
        t1.start();
        RunnableDemo R2 = new RunnableDemo("Two");
        Thread t2 = new Thread(R2);
        t2.start();
        
    }
    
}
