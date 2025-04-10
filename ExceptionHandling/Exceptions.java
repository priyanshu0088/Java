/*Run time errors are known as exceptions*/

public class Exceptions{
    public static void main(String a[]){
            int i=0;
            int j=9;
            try{      //this will try to excute this and if there is an error it will throw an exception as an object
                j=j/i;
            }
            catch(Exception e){ // here we are accepting exception as an object
                System.out.println("something went wrong");
            }
                //if we haven't handle the exception then due to error code could be stopped but here we have handled so 
                //next line of codes will be excuted easily.

                System.out.println(j);
    }
}