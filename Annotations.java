/*
 *Annotations in Java are metadata (data about data) that provide additional information about code.
  They do not affect program logic but are used by compilers, tools, or frameworks for processing.


 */
//@SuppressWarnings -> Suppresses compiler warnings.
//@FunctionalInterface -> Ensures an interface has exactly one abstract method (for lambda expressions).


class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    @Override           //Annotation
    public void show(){
        System.out.println("in B show");
    }
}
public class Annotations {
    public static void main(String[] args) {
    B obj = new B();
    obj.show();
    }
}
