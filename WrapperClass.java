public class WrapperClass{
    public static void main(String[] args) {
        int n=12;
        Integer num1 = n; // primitive to wrapper - Autoboxing
        System.out.println(num1);

        int n1 = num1; // wrapper to primitive - Autounboxing
        System.out.println(num1);

        String str = "100";
        int parsedValue = Integer.parseInt(str); // Converting String to int
        System.out.println(parsedValue);


        
    }
}
/*
 * Wrapper classes in Java are used to convert primitive data types into objects. 
 They provide a way to use primitive data types (such as int, double, char, etc.)
   as objects. Each primitive type has a corresponding wrapper class in the java.lang package.
 */