import java.util.Scanner;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        System.out.print("Enter A String  : ");
        Scanner sc = new Scanner((System.in));
        String str = sc.nextLine();

        char[] strArray = str.toCharArray();
        String vowel = "aeiouAEIOU";
        int left = 0, right = strArray.length-1;

        while(right>left){ //reversing the Vowels in the string
            if(vowel.indexOf(strArray[left]) == -1){
                left++;
            }
            else if(vowel.indexOf(strArray[right])==-1){
                right--;
            }
            else{
                char temp = strArray[left];
                strArray[left++] = strArray[right];
                strArray[right--] = temp;
            }
        }

        int vowelCount = 0;

        for(char val : strArray){
            if(vowel.indexOf(val) != -1){
                vowelCount++;
            }
        }

        System.out.println("The new String is : " + new String(strArray));
        System.out.println("The Vowel Count is : " + vowelCount);
    }


}
