public class SortColors {

    public static void swap(int[] arr, int var1, int var2){
        int temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,0,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0};

//        int mid = 0, low=0, high=nums.length-1;
//        while(mid<=high){
//            if(nums[mid] == 0){
//                swap(nums, low, mid);
//                low++;mid++;
//            }
//            else if(nums[mid]==1){
//                mid++;
//            }else{
//               swap(nums,mid,high);
//               high--;
//            }
//        }

        int low=0, high=nums.length-1;
        while(low<=high){
            if(nums[low] == 0){
                low++;
            }
            else {
                swap(nums, low, high);
                high--;
            }
        }

//        System.out.println("The Sorted Array is : " + Arrays.toString(nums) );
        System.out.print("The Sorted Array is : "  );
        for(int i=0; i<=nums.length-1; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
