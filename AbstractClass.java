abstract class WagonR{
    abstract void drive();
    abstract void fly();
    public void control(){
        System.out.println("control...");
    }
    
}

class Car extends WagonR{
    void drive(){
        System.out.println("dirve...");
    }
    void fly(){
System.out.println("fly.....");
    }
}
/*
  An abstract class in Java is a class that cannot be instantiated on its own and 
  is meant to be inherited by other classes. It is defined using the abstract
 keyword and may contain abstract methods (methods without implementation) 
 and concrete methods (methods with implementation).

 Key Features of Abstract Classes

*Cannot be Instantiated
An abstract class cannot create objects directly.

*May Contain Abstract Methods
These methods are declared without a body and must be implemented by the subclasses.

*Can Have Concrete Methods
Unlike interfaces, abstract classes can have fully defined methods.

*Can Have Instance Variables
Abstract classes can have variables, unlike interfaces which only allow constants.

*Can Have Constructors
Though abstract classes cannot be instantiated, they can have constructors 
that are called when a subclass object is created.

 */

public class AbstractClass {
    public static void main(String[] args) {
        WagonR obj = new Car();

        obj.drive();
        obj.fly();
        obj.control();
    }
}

