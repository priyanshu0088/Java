

class Parent{
    public int Add(int a, int b){
        System.out.println("Parent class add method");
        return a+b;
        
    }
}
class Child extends Parent{
    @Override               // overriding the Add method of parent class
    public int Add(int a,int b){
        super.Add(a, b); // calls the parent class add method
        return a+b+1;
    }
}
/*
 Method Overriding in Java
Method Overriding in Java is a feature that allows a subclass (child class) to provide a specific implementation of a method that
 is already defined in its superclass (parent class). The overridden method in the child class must have 
 the same name, return type, and parameters as the method in the parent class.

Rules for Method Overriding
Same Method Signature – The method in the child class must have the same name and parameter list as in the parent class.
IS-A Relationship – The child class must inherit from the parent class (i.e., there must be an inheritance relationship).
Access Modifier – The overridden method cannot have a more restrictive access modifier than the method in the parent class.
✅ public → public
✅ protected → protected or public
❌ public → private (not allowed)
Return Type – The return type must be the same or a subclass (covariant return type) of the return type of the method in the parent class.
Final and Static Methods Cannot be Overridden – Methods declared as final or static in the parent class cannot be overridden.
Use of @Override Annotation (Optional but Recommended) – Helps catch errors if the method signature is incorrect.

 */
public class MethodOverriding {
    public static void main(String[] args) {
       Child obj = new Child();
       int result = obj.Add(3,5);
       System.out.println(result);
    }
}
