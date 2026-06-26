import java.util.HashMap;

public class Twosum {
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> maps = new HashMap<>();
        int[] nums = {2,3,5,8,7};
        int target = 9;
        for (int i = 0; i<nums.length;i++) {
            int complement = target- nums[i];
            if(maps.containsKey(complement)) {
                System.out.println("[" + maps.get(complement) + " ," + i + "]");
                return;
            }
            maps.put(nums[i],i);
        }
    }
}
