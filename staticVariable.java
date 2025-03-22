class Mobile{
    int price;
    String brand;
    static String name;

    public void show(){
        System.out.println("price=" + price);
        System.out.println("brand="+ brand);
        System.out.println("name="+ name);
    }
}
public class staticVariable {
    public static void main(String[] args) {
        /*staic variable are those which are commonly shared among all the objects in the class */
        //They should be called by the class name, you can call it by objects name also by it would be right to call with class name.
        //Non static methods can also have a static variable.

        Mobile obj1= new Mobile();
        obj1.brand="realme";
        obj1.price=12000;

        Mobile.name="Android"; //static variable

        Mobile obj2 = new Mobile();
        obj2.brand="redmi";
        obj2.price=13000;
        
        obj1.show();
        obj2.show();



    }
}
