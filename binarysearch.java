public class binarysearch{
    
public static int binarysearch(int array[] , int key ){
    int left = 0;
    int right = array.length -1;

    while ((left<=right)) {
        int mid = left +(right - left)/2;

        if(array[mid]==key){
            return mid;
        }

        if(array[mid]<key){
            left = mid+1;
        }


        else{
            right = mid-1;
        }
    }
    return -1;
}



    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9};
        int key  = 6;

        System.out.println("The index of the key is : " + binarysearch(array, key));
    }
}