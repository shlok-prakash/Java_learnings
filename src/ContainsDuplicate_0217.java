import java.util.*;
public class ContainsDuplicate_0217 {
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> uniques = new HashSet<>();
        for(int val : nums){
            if(uniques.contains(val)){
                return true;
            }
            uniques.add(val);
        }
        return false;

    }
    public static void main(String[] args) {
//        int[] nums ={1,2,3,1};
        int[] nums ={1,2,3,4};
//        int[] nums ={1,1,1,3,3,4,3,2,4,2};
        System.out.println((containsDuplicate(nums)));

    }
}
