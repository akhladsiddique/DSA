class Solution {
    public int thirdMax(int[] nums) {
          int n=nums.length;
          
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
        maximum=Math.max(maximum,nums[i]);
            
        }
        int maxi = Integer.MIN_VALUE;
        boolean found = false;
          for(int i=0;i<n;i++){
            if(nums[i]!=maximum){
                maxi=Math.max(maxi,nums[i]);
                found = true;
               }
            
        }
        int max=Integer.MIN_VALUE;
        boolean flag = false;
          for(int i=0;i<n;i++){
            if((!found || nums[i] !=maxi) && nums[i]!=maximum){
                max=Math.max(max,nums[i]);
                flag = true;
               } 
            }
            
          return flag ? max : maximum;
      
        
    }
}