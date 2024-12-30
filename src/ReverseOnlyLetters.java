import java.util.Scanner;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] inputArray = input.toCharArray();
        int left =0;
        int right = inputArray.length-1;
        while(left<right){
            if(!Character.isLetter(inputArray[left])){
                left++;
            }
            else if (!Character.isLetter(inputArray[right])) {
                right--;
            }
            else{
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++; right--;
            }
        }
//        input  = String.valueOf(inputArray);
        System.out.print("Reversed String is : " + new String(inputArray));
    }
}
