public class maxarr {

    public static int LargestArray(int array[]) {
        if (array == null) {
            System.out.println("Array is Null:");
            return -1; 
        }

        if (array.length == 0) { // Corrected check for empty array
            System.out.println("Array is Empty");
            return -1; 
        }

        int largest = array[0]; // Start with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 2, 8, 9, 6, 4, 7};
        System.out.println("The Largest Element in Array is : "+LargestArray(array));
    }
}