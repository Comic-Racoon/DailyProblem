package problems.recurssion.level1;

public class problem1 {

    // print n to 1

    public static void main(String[] args) {

        int n = 5 ;

        printton(5);
    }

    private static void printton(int i) {

        if(i == 0 ){
            return;
        }
        System.out.println(i);
        
        printton(i - 1);
    }
}
