class Human{
    private int age;     //private variables, not accessible outside this class
    private String name;

    public int GetAge(){
        return age;                                                     //Getters and setters methods for data
    }
    public void SetAge(int a ){
        age = a;                
    }

    public String getName(){
        return name;
    }
    public void SetName(String n){
        name = n;
    }
}

// here in encapsulation we bind methods and data together in the form like a capsule to protect and bind the data together
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.SetAge(20);
        obj.SetName("Priyanshu");
        System.out.println(obj.GetAge() + ":" + obj.getName());
    }
}
