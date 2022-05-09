/*
 * Dynamic Method dispatch is the mechanism by which a call to an overridden method to
resolved at runtime, rather than compile time.
 */

/**
 *
 * @author Purusottam
 */

class A{
    void callme(){
        System.out.println("Inside A's callme method");
    }
}
class B extends A{
    void callme(){
        System.out.println("Inside B's callme method");
    }
}
class C extends B{
    void callme(){
        System.out.println("Inside C's callme method");
    }
}
public class disptach {
    public static void main(String[] args) {
        A a = new A();
        B  b= new B();
        C c = new C();
        A r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r= c;
        r.callme();
    }
    
}
