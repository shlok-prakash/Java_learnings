package Notes_For_Java;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] Array = new int[row][col];

        //taking input
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                Array[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(Array[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number to be found :");
        int x =  sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (Array[i][j] == x){
                    System.out.println("Element found at "+ i+ j);
                }
            }
            System.out.println();
        }

    }
}
