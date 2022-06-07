package problems.recurssion.sorting;

public class SelectionSort {


    public static void main(String[] args) {

        int arr[] = { 6,3,5,8,2,9,1,7};

        selectionSort(arr, 0, arr.length -1, 0);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    static void selectionSort(int [] arr, int c, int r, int max ){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionSort(arr, c+1, r, c);
            }
            else{
                selectionSort(arr, c+1, r, max);
            }
        }

        else {

            int temp = arr[max];
            arr[max ] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, 0 , r-1, 0);

        }
    }
}
