class Parent{
   public void display(){
    System.out.println("Parent class");
   }
}

class Child extends Parent{
        public void show(){
            
            System.out.println("Child class");
        }
}
/*Multiple nheritence is not supported in java due to ambiguity problem */
public class Inheritence {
    public static void main(String[] args) {
       Child obj = new Child();
    //    obj.display();
       obj.show();

    }
}
