 class Students{

    int age;
    int marks;
    String name;
 }
 
 public class ArrayOfObjects {
    public static void main(String a[]){
        Students s1=new Students();
        s1.age=20;
        s1.marks=56;
        s1.name="Kashish";

        Students s2=new Students();
        s2.age=21;
        s2.marks=45;
        s2.name="Kamal";

        Students s3=new Students();
        s3.age=22;
        s3.marks=76;
        s3.name="kriti";

        Students StudentArr[] = new Students[3];
        StudentArr[0]=s1;
        StudentArr[1]=s2;
        StudentArr[2]=s3;


        for(int i=0;i<StudentArr.length;i++){
                System.out.println(StudentArr[i].age + " " + StudentArr[i].marks + " " + StudentArr[i].name );
        }

    }
    
    
}
