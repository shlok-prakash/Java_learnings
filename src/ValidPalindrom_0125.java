public class ValidPalindrom_0125 {

    public static boolean isAlphanumeric(char c){
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean validPalindrome(char[] strArray){
//        if(strArray.length == 1){
//            return true;
//        }

        int left = 0;
        int right = strArray.length-1;

        while(left<=right){
            if(!isAlphanumeric(strArray[left])){
//                System.out.println(("This is the left character : " + strArray[left]));
                left++;
            }
            else if (!isAlphanumeric(strArray[right])) {
//                System.out.println(("This is the right character : " + strArray[right]));
                right--;
            }
            else{
//                System.out.println(("This is the left character : " + strArray[left]));
//                System.out.println(("This is the right character : " + strArray[right]));
                if(strArray[left] != strArray[right]){
                    return false;
                }else{
                    left++; right--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
//        String str = " ";
//        String str = "race a car";
        str = str.toLowerCase();
        char[] strArray = str.toCharArray();
        System.out.println("The String is a valid palindrome :" + (validPalindrome(strArray)));
    }
}
