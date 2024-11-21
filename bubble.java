import java.util.Arrays;
public class bubble{

    public static void sort(int arr[]){

        // Run the steps n-1 times
        for(int i =0; i<arr.length; i++){
            // for each steps the max element will come into the last index of the array 
            for(int j =1; j<=arr.length-1-i; j++){
                // swap if the element is smaller is the previous element 
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;

                }
            }
        
        }
    
    }
    public static void main(String[] args) {
    int[] arr ={5,4,3,2,1};

    sort(arr);
   System.out.println(Arrays.toString(arr));

    }
}