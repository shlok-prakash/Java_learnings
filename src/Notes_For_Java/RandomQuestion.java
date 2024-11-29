package Notes_For_Java;

import java.util.Scanner;

public class RandomQuestion {

    public static int factorialOfNumber(int num){
        if(num<0){
            System.out.print("Invalid Number");
            return 0;
        }
        if (num == 0) {
            return 1;
        }
        int fact = 1;
        for(int i = num; i>0; i--){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int result = factorialOfNumber(Number);
        System.out.print("Factorial of the Number : "+ result );

    }
}
