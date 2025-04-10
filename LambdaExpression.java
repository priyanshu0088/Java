@FunctionalInterface
interface A{
    void show();
}
/*
  In Java, lambda expressions were introduced in Java 8
   to provide a clear and concise way to represent functional interfaces
  (interfaces with a single abstract method).
 */
public class LambdaExpression {
   public static void main(String a[]){

    //without lambda expression
//     A obj = new A(){
//         public void show(){
//             System.out.println("this is show");
//         }
//     };
//     obj.show();
//    }


// with lambda expression

A obj = () -> System.out.println("Hello from lambda"); //only 2 lines  (this(->) is known as lambda expresiion)
obj.show();

}
}
/* BENIFIT
 Lambda expressions allow you to write more concise and readable code,
  especially when you're implementing simple functional interfaces (like event handlers, comparators, etc.).
 */