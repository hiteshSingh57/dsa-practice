public class MaxNumber {
    public static int findMax(int[] nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,6,3,9,8};
        System.out.println(findMax(nums));
    }
}
