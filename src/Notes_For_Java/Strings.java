package Notes_For_Java;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i=0; i<str.length()/2; i++){
            int start = i,
                    end = str.length()-1-i;

            char frontChar = str.charAt(start),
                    backChar = str.charAt(end);

            str.setCharAt(start, backChar);
            str.setCharAt(end,frontChar);
        }
        System.out.println("Reversed String is : "  + str );

    }

    public static class BubbleSort {

        public static void printArray(int[] arr){
            for(int val : arr){
                System.out.print(val+ " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int[] arr = {7,8,3,1,2};
            //Bubble Sort
            for(int i=0; i<arr.length-1; i++){
                for (int j=0; j<arr.length-1-i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            printArray(arr);
        }
    }
}
