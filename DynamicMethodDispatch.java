class Base{
    public void show(){
        System.out.println("Base show");
    }
}
class Derieved extends Base{
    @Override
    public void show(){
        System.out.println("Derieved show");
    }
}
/*
   Dynamic Method Dispatch (also called Runtime Polymorphism) is a mechanism in Java
   where a method call is resolved at runtime instead of compile-time. 
   It allows method overriding, where a subclass provides a specific implementation of
   a method that is already defined in its superclass.
 */

public class DynamicMethodDispatch {
    public static void main(String[] args) {
         Derieved obj = new Derieved();
         obj.show();
        
    }
}
