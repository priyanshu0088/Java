public class Strings {
    public static void main(String[] args) {
        
    
    String s1= "priyanshu"; //This will work but this is not the right way because string is a class.

    String s2 = new String("ShreeRam"); // this is the right way.

    System.out.println(s1);
    System.out.println(s2);

    String s3="Rahul"; // here s3 and s4 are not two objects because they both contains same strings so they both will just store common refrence of "Rahul"
    String s4 = "Rahul";
    System.out.println(s3==s4);
    }

    
}
