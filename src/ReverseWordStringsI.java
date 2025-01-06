import java.util.Scanner;

public class ReverseWordStringsI {
    public static void main(String[] args) {
        System.out.print("Enter a Sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArray = str.split(" ");

        StringBuilder newStr = new StringBuilder();
        for(int i=strArray.length-1; i>=0; i--){
            if(!strArray[i].isEmpty()){
                newStr.append(strArray[i].trim()).append(" ");
//                continue;
            }

        }
        System.out.print("New String Is:" + newStr.toString().trim());

    }
}
