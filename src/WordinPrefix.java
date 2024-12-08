import java.util.Scanner;

public class WordinPrefix {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String searchWord = sc.nextLine();

        int i=0;

        for(String val : sentence.split(" ")){
            i++;
            if(val.length() >= searchWord.length()){
                if(val.startsWith(searchWord)){
                    System.out.println("The word and the position is " + val + " " + i);
                }
            }
        }
    }
}
