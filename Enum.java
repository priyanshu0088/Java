enum days{
    sunday,monday,tuesday,wednesday,thursday,friday,saturday 
}
/*
 * An enum (enumeration) in Java is a special data type that represents a fixed set of constants. 
 *Enums are useful when you have a predefined list of values that do not change, such as days of 
  the week, directions, colors, etc.
 */

 /*
  Key Features of Enums:

Enums are final and cannot be extended.
Each enum constant is an instance of the enum type.
Enums can have fields, constructors, and methods.
By default, enums extend java.lang.Enum and cannot extend other classes.
They are type-safe, meaning they only allow predefined values.
  */

public class Enum {
    public static void main(String[] args) {
        days D = days.monday;
        System.out.println(D);
        System.out.println(D.ordinal()); //index value
        days[] arr = days.values();

        for(days i : arr){
            System.out.println(i + " " + i.ordinal());//iterating and printing the values and indexs
        }


    
       
    }
}
