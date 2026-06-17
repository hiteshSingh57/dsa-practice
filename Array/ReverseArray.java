public class ReverseArray {
    public static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
       }
    }
    public static void main(String[] args) {
        int[] nums = {3,9,5,4,2,1};
        reverseArray(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}