// class to class -> extends
//class to interface -> implements
//interface to interface -> extends

// interface can extends interface(inheritence)
//variables defined inside interface are byDefault static and final
interface A{
    void show();
    void code();
}
interface B extends A{
    void display();
}
class X implements B{
    
        public void show(){
            System.out.println("show of A");
        }

        
        public void code() {
            System.out.println("code of A");
        }

        
        public void display() {
            System.out.println("display of B");
        }
        
}
public class InterfaCe {
    public static void main(String[] args) {
       A obj = new X();
       obj.show(); 
       obj.code();

       B obj1 = new X();
       obj1.display();
    }
}
/*
 * Interfaces in Java
In Java, an interface is a blueprint of a class that contains only abstract methods (before Java 8) and static or default methods (from Java 8 onwards). It is used to achieve abstraction and multiple inheritance.

Key Features of Interfaces:

Methods are Abstract by Default:
Before Java 8, all methods in an interface were abstract.
From Java 8 onwards, interfaces can also have default and static methods.
Variables are Public, Static, and Final:
All variables in an interface are implicitly public, static, and final.
No Constructors:
Interfaces cannot have constructors because they cannot be instantiated.
Supports Multiple Inheritance:
A class can implement multiple interfaces, allowing Java to achieve multiple inheritance.
Must be Implemented:
A class implementing an interface must provide implementations for all its methods.
 */
