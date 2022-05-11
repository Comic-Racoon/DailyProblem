//package problems.dynamicProblems.knapsack0_1;
//
//public class knapSack_3_topDown {
//
//    /*
//    Top - Down approach
//
//    step 1 :- initialization
//
//    step 2 :- recursive call ko iterative approach mai convert kr do
//
//     */
//    static int W = 20 ;
//    static int P = 20;
//    static int [][] t = new int[W][P];
//    public static void main(String[] args) {
//
//
//        // find the maxmimum profit from given weight and value array
//
//        int [] weight = {2, 5, 2, 3, 4};
//        int [] value =  {2, 7, 1, 5, 3};
//        int maxWeight = 8;
//        int sizeOfArray = 5;
//
//        // for base condition think -- of the smallest valid input
//
//        for(int i =0; i<W+1; i++ ){
//            for(int j =0; j<P+1; j++){
//                if(i == 0 || j == 0){
//                    t[i][j] = 0;
//                }
//
//                if(weight[sizeOfArray-1] <= maxWeight){
//                    t[]
//                }
//
//            }
//        }
//
//
//        System.out.println(knapsackRecesive(weight, value, maxWeight, sizeOfArray));
//
//    }
//
//    private static int knapsackRecesive(int[] weight, int[] value, int w, int n) {
//
//        // for base condition think -- of the smallest valid input
//
//        if(n == 0 || w == 0){
//            return 0;
//        }
//
//        if(weight[n-1] <= w ){
//
//            return
//                    Math.max((value[n-1]
//                                    + knapsackRecesive(weight, value, w - weight[n-1], n-1 )),
//                            knapsackRecesive(weight, value, w , n-1 ));
//        }
//
//        else {
//            return knapsackRecesive(weight, value, w , n-1 );
//        }
//
//    }
//}
