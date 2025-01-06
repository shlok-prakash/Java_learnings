import java.util.Arrays;

public class SortColors {

    public static void swap(int[] arr, int var1, int var2){
        int temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

    public static void main(String[] args) {
//            int[] nums = {2,0,2,1,1,0};
            int[] nums = {2,0,1};
            int mid = 0, low=0, high=nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
               swap(nums,mid,high);
               high--;
            }
        }

        System.out.println("The Sorted Array is " + Arrays.toString(nums));
    }
}
