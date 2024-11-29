package Notes_For_Java;

import java.util.*;
public class Pattern {
    public static void pattern1(int numberOfRows){ //Hollow square
        for (int i=0; i<numberOfRows; i++){
            for (int j =0;j<numberOfRows ; j++){
                if(i==0||j==0||i==numberOfRows-1||j==numberOfRows-1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int numberOfRows){  // Zero-One Triangle
        for (int i=0; i<numberOfRows; i++){
            for (int j=0; i>=j; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern3(int numberOfRows){  //butterfly
        for(int i=1; i<=numberOfRows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            int spaces = 2*(numberOfRows-i);
            for(int j=1; j<=spaces ; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=numberOfRows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            int spaces = 2*(numberOfRows-i);
            for(int j=1; j<=spaces ; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int numberOfRows){  //rhombus
        for (int i=0; i<=numberOfRows; i++){
            int spaces =  numberOfRows-i;
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=numberOfRows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int numberOfRows){  //rhombus
        for (int i=1; i<=numberOfRows; i++){
            int spaces =  numberOfRows-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int numberOfRows){ //Palindromic pattern
        for(int i=1; i<=numberOfRows; i++){
            int spaces=numberOfRows-i;
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int numberOfRows){ //Diamond pattern
        for(int i=1; i<=numberOfRows; i++){
            int spaces = numberOfRows-i;
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            int stars = (2*i)-1;
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=numberOfRows-1; i>=1; i--){ // also allows i=numberOfRows
            int spaces = numberOfRows-i;
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            int stars = 2*i-1;
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter the Number of Lines");
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        pattern7(numberOfRows);
    }
}