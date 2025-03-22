class temp  {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {
     public static void main(String[] args) {
        temp obj=new temp();
       int result1= obj.add(2,3);
        int result2=obj.add(2,3,4);
        System.out.println(result1);
        System.out.println(result2);

    }
}
