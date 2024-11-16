public class arraypair {

    public static  void printpair(int numbers[]){
        for (int i = 0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j= i+1; i<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {22,33,44,55,66,77,88,99};

        printpair(numbers);

    }
}
 