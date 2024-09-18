import java.util.*; 

public class Solution{

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = (target - nums[i]);
            if (map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            else if (!map.containsKey(diff)){
                map.put(nums[i], i);
            }
                
        }
        return null;
        
    }


    // TESTING
    // public static void main(String[] args) {
    //     int[] nums = {3,3};
    //     int target = 6;

    //     System.out.println(Arrays.toString(twoSum(nums, target)));
    // }
}
