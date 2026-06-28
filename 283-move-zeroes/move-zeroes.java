class Solution {
    public static void moveZeroes(int[] nums) {
 int n =nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                int temps=nums[j];
                nums[j]=nums[i];
                nums[i]=temps;
                i++;
            }

        }
    }
}