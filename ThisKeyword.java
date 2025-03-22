class temp{
    private int salary;
    private String name;

    public String GetName(){
        return name;
    }
    public void SetName(String name){    //here this.name refers to the instance variable where as another name is refered as local variable.
    /*instance variable*/ this.name = /*local variable*/name;
    }

    public int GetSalary(){
        return salary;
    }
    public void SetSalary(int salary){
        this.salary=salary;
    }
}

// this keyword is used to refer the current object, current object means the object By which the method is called
public class ThisKeyword {
public static void main(String[] args) {
    temp obj = new temp();
    obj.SetName("Priyanshu");
    obj.SetSalary(60000);

    System.out.println(obj.GetName() + ":" + obj.GetSalary());
}

    
}