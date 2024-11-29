package Notes_For_Java;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of the array :");
        int size = sc.nextInt();
//        int arr[] = new int[size]; //C type declaration
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }


        for(int i=0; i<size; i++){
            System.out.println("The element at "+i + " is : "+ arr[i]);
        }

        int x =  sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if (arr[i] == x){
                System.out.println("Element found at "+ i);
            }
        }
//        for(int val: arr){
//            if (val == x){
//                System.out.print("Number Found");
//            }
//
//        }

    }
}
