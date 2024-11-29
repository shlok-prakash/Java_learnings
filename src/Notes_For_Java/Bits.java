package Notes_For_Java;

public class Bits {
    public static void main(String[] args) {
        int n=5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~bitMask;

        //Get Bit
        if((bitMask & n) == 0){
            System.out.println("bit was Zero");
            }else{
            System.out.println("bit was One");
        }

        //Set Bit
        int newNumber = bitMask | n;
        System.out.println("New Number is : " + newNumber);

        //Clear Bit
        int newNum = notBitMask & n;
        System.out.println("New Number is : " + newNum);
    }
}
