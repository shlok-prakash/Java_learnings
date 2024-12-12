import java.util.Scanner;

public class ReverseWordsStringIII {
    public static void reverseString(char[] c, int R, int L){
        while(L<=R) {
            char temp = c[L];
            c[L++] = c[R];
            c[R--] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] strArray = str.toCharArray();
        int left=0,right=0;

        while(right < strArray.length-1){
            if(strArray[right]==' '){
                reverseString(strArray, right-1 , left);
                left = right+1;
            }
            right++;
        }

        reverseString(strArray, strArray.length-1, left);


        System.out.print("The New Array is : " + new String(strArray) );
    }
}
