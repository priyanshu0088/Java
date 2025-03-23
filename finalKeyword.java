final class calc{
    final public void show(){
        System.out.println("calc show");
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends calc{ // gives error
    @Override
    public void show(){ // gives error

    }
}
/*final keyword
 * we can use final keyword with these - variable,class,methods
 * variables- to make the variable as a constant
 * class - if we make the class final then that class ca't be inherited(to stop inheritence)
 * Methods - if we make any method as a final then that method can'tt be overridden.
 */
public class finalKeyword {
    public static void main(String[] args) {
        
    }
}
