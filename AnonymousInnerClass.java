class A{
    void show(){
        System.out.println("in A show");
    }
}
public class AnonymousInnerClass{
public static void main(String a[]){
    A obj = new A(){
        void show(){
            System.out.println("In new Show");
        }
    };
    obj.show();
}
}