import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    public static void swap(int[] arr, int var1, int var2){
        int temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i <= arr.length-2; i++){
            int min=i;
            for(int j=i; j <= arr.length-1; j++){
                if(arr[j]<arr[min]) min=j;
            }
            swap(arr, min, i);
        }
        System.out.println("The Sorted Array using Selection Sort is " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1; i>=1; i--){
            int didSwap = 0;
            for(int j=0; j<i-1; j++){ //since I am also considering the last element.
                if(arr[j]>arr[j+1]){
                    swap(arr, j+1, j);
                    didSwap=1;
                }
            }
            if(didSwap ==0) break;
        }
        System.out.println("The Sorted Array using Bubble Sort is " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr, int n){
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j-1, j );
                j--;
            }
        }
        System.out.println("The Sorted Array using Insertion Sort is " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.print("Enter the Size of the Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the numbers in the Array :");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        bubbleSort(arr);
        insertionSort(arr,n);
    }

}
