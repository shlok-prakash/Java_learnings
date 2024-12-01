public class CountVowelsStrings {
    public static void main(String[] args) {
//        String[] words = {"u","c","e","wrw"};
        String[] words = {"vo","j","i","s","i"};

        int count=0;
        for(String val: words){
            int start = 0, end = val.length()-1;
            if(val.length() == 1 && isVowelString(val.charAt(start))){
                count++;
            }
            if(isVowelString(val.charAt(start)) && isVowelString(val.charAt(end))) {
                count++;
            }
        }
        System.out.println("Count Of Vowel String is : " + count);
    }

    private static boolean isVowelString(char c ) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }
}
