import java.util.*;

public class CountFreqofCharacter {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input  = input.toLowerCase();
//        char[] inputArray = input.toCharArray();

        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        for(char val: input.toCharArray()){
            frequencyMap.put(val,frequencyMap.getOrDefault(val,0)+1);
        }

        frequencyMap.remove(' ');

        System.out.println("Repetitive letters ");
        for(char key:  frequencyMap.keySet()){
            if(frequencyMap.get(key)>1){
                System.out.println(key+ " : "+ frequencyMap.get(key));
            }
        }
    }
}
