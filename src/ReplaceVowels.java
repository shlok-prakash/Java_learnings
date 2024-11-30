import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder newStr = new StringBuilder();

        for(char val : input.toCharArray()){
            if(isVowels(val)){
                newStr.append('x');
            }
            else{
                newStr.append(val);
            }
        }

        System.out.print("New updated String is : " + newStr.toString());


    }
    public static boolean isVowels(char c){
        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(c) != -1) return true;
        else return false;
    }
}
