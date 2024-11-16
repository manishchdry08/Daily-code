public class linearsearch {

    public static int linearsearch(int array[] , int target){

        for(int i = 0; i<array.length; i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {55,52,4,6,33,29,96};
        int target = 96 ;
        System.out.println("The index of the target is : " + linearsearch(array, target));
    }
    
}
