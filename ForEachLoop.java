public class ForEachLoop {
    public static void main(String a[]){
        int arr[] = new int[4];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        //for each loop will only require a single variable which will take the values from the array and print it one by one.

        for(int n: arr){
            System.out.println(n); //For each loop
        }
        
        // benifit of using for each loop is that we dont require to incriment or decriment the variable.
    }
    
}
