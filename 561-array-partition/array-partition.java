import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        // 1. Sort the array in ascending order
        Arrays.sort(nums);
        
        int sum = 0;
        
        // 2. Jump by 2 and add every even-indexed element
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }
}