 class calculator{
    int calci(int n1,int n2){
        return n1+n2;
    }
}

public class calc {
    public static void main(String a[]){
        int num1=5;
        int num2 = 6;
        
        calculator obj1 = new calculator();
        int result=obj1.calci(num1,num2);
        System.out.println(result);

            


    }
    
}
