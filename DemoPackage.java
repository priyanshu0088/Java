
import Tools.AdvCalc;  //importing packages from tools folder
import Tools.Calc;

public class DemoPackage {
    public static void main(String[] args) {
        AdvCalc obj1 = new AdvCalc();
        int result = obj1.sub(5,2);
        System.out.println(result);

        Calc obj2 = new Calc();
        int result2 = obj2.Add(5,6);
        System.out.println(result2);
    }
    
}