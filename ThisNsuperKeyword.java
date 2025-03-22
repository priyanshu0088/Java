class A{
    A(){
        System.out.println("Default constructor of A");
    }
    A(int x){
        this(); // This will call the default constructor of A
        System.out.println("Parameterized constructor of A " + x);
    }
}
class B extends A{
    B(){
        super(3); // this will call the parameterized constructor of A
        System.out.println("Default constructor of B");
    }
    B(int n){
       
        System.out.println("parameterized constructor of B " + n);
    }
}
// Note -: every constructor have a method called super();

//super keyword
/*super keyword is used to call the constructor of super class
    *it is used to call the method of parent class
    * it is used to call the parent class variable


THIS keyword
 * This keyword is used to call the another constructor of same class.
 * It helps differentiate between instance variables and method parameters when they have the same name.
 * there is a class in java known as object class. every class extends that object class.
 * 
*/
public class ThisNsuperKeyword {
    public static void main(String[] args) {
        B obj = new B(); // we are calling default constructor of class B.
    }
}
