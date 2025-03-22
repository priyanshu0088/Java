public class stringBuffer {
    public static void main(String[] args) {

        /*there are two types of strings 1 is mutable and another is immutable mutable means we can
        change the strings and immutable means it can't be changed*/
        
        /*StringbUffer class provide us the mutable strings we have various mehods from which we can 
        do modifications on the strings*/
        StringBuffer s1 = new StringBuffer("Priyanshu");
        System.out.println(s1);
        s1.append(" Vishwakarma");
        System.out.println(s1);

        s1.insert(10, "Dev "); //after 10th position add "Dev".
        System.out.println(s1);

        //StringBuffer gives extra 16 space capacity for any string.
        //Difference between StringBuffer and StringBuilder is that StringBuffer is threat safe but StringBuilder is not.
    }
}
