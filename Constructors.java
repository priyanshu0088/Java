class Demo{
    int age;
    String name;

    public Demo(){      //default constructor
        age = 12;
        name = "Rahul";
    }
    public void display(){
        System.out.println(age + ":" + name);
    }

    public Demo(int age, String name){   // Parameterized constructor
        this.age=age;
        this.name=name;
    }

}

//Constructor is a special method which is used to initialize an object
/*Properties
 * it's name is similer to the name of the class
 * it has no return type
 * 
 */
public class Constructors {
    public static void main(String a[]){
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(5,"navin");
        obj1.display();
        obj2.display();
    }
}
