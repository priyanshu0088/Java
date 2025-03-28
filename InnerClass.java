
class A{
    int a=10;
    public void show(){
            System.out.println("value of A is:" + a);
    }

    class B{    //inner class
        public void display(){
            System.out.println("inside inner class B");
        }
    }
}
/*
 *An inner class in Java is a class that is defined inside another class. 
 Inner classes allow better encapsulation and logical grouping of related classes.


 */
public class InnerClass {
    public static void main(String[] args) {
        
    
    A obj = new A();
    A.B obj1 = obj.new B(); // creating object of inner class using outer class
    obj.show();
    obj1.display();
    }

}
