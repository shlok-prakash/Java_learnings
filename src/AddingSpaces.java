
public class AddingSpaces {
    public static void main(String[] args) {
        String Input = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15,17};

        char[] inputArray = Input.toCharArray();
//        int j=0;

        StringBuilder output =new StringBuilder();
        for(int i=0,j=0; i < inputArray.length-1; i++ ){
            if( j<spaces.length-1 && i!=spaces[j]){
                output.append(' ');
                j++;
            }else{
                output.append(inputArray[i]);
            }
        }

        System.out.print("The New String is :" + output);

    }
}
