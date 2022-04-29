public class problem_2 {

    /*

   Given an array of integers, return a new array such that
     each element at index i of the new array is the product of
     all the numbers in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5], the expected
    output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1],
     the expected output would be [2, 3, 6].

    Follow-up: what if you can't use division?*/

    public static void main(String[] args) {

        int[] arr = {1,2,3,4} ;

        // the expected output would be [120, 60, 40, 30, 24]

        Solution1(arr);
        solution_2(arr);
        solution_3(arr);
    }

    private static void Solution1(int[] arr) {
        int total_product = 1;

        for(int num : arr){
            total_product = total_product * num;
        }

        int res[] = new int[arr.length];

        for(int i =0 ; i< arr.length; i++){
            res[i] = total_product/arr[i];
        }

        for(int n : res){
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }

    private static void solution_2(int [] arr){

        int size =  arr.length;
        int left [] = new int[size];
        int right [] = new int[size];

        for (int i =0; i< size; i++){
            if(i == 0){
                left[i] = arr[i];
            }
            else{
                left[i] = arr[i]* left[i-1];
            }
        }

        for (int i = size-1; i>=0; i--){
            if(i == size -1 ){
                right[i] = arr[i];
            }
            else{
                right[i] = arr[i]* right[i+1];
            }
        }

        int result [] = new int[size];

        for(int i = 0 ; i< size; i++){
            if(i == 0){
                result[i] = right[i];
            }
            else if(i == size -1){
                result[i] = left[i -1];
            }
            else{
                result[i] = left[i-1] * right[i+1];
            }
        }

        for (int n :result){
            System.out.print(n + " ");
        }
        System.out.println(" ");

    }

    private static void solution_3(int[] arr) {
        // without using extra space

        int result [] = new int[arr.length];

        for(int i =0; i< arr.length; i++){
            if(i == 0){
                result[i] = arr[i];
            }
            else{
                result[i] = arr[i]* result[i-1];
            }
        }

        int product = 1;

        for(int i = arr.length-1; i > 0; i--){
            result[i] = result[i-1] * product;
            product = product* arr[i];
        }
        result[0] = product;

        for(int n : result){
            System.out.print(n + " ");
        }
    }
    
}
