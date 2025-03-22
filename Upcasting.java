class X{
    public void display(){
        System.out.println("X display");
    }
}
class Y extends X{
    @Override
    public void display(){
        System.out.println("y display");
    }
}
/*
 *Upcasting means assigning a child class object to a parent class reference.

It is implicit (automatic) and does not require an explicit cast.

It allows the parent class reference to call overridden methods of the child class (Dynamic Method Dispatch).
 */

public class Upcasting {
    public static void main(String[] args) {
        X obj = new Y(); // Object of Y but refrence of X
        obj.display();
    }
}
