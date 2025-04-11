
public class Exceptions2 {
    public static void main(String[] args) {
         int arr[] = new int[5];
         int i=0; 
         int j=5;  
         
         try{
            System.out.println(arr[5]); //if exceptions found on this line then it will break from the try block and next line willl not be excuted
            j=j/i;
         }
         catch(ArrayIndexOutOfBoundsException e){  // this will manage only array exceptions
            System.out.println("something went wrong:"+e); 
         }
         catch(Exception e){
            System.out.println("Something went wrong"+e); //this catch block can manage all type of Exceptions
         }
    }
}

// Runtime Exceptions - Unchecked exceptions
// other exceptions - Checked exceptions
