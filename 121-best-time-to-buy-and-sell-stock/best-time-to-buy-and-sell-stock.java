class Solution {
    public int maxProfit(int[] arr) {
        int n =arr.length;
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(min>arr[i]){
                min =arr[i];
            }else{
            
                profit=Math.max(profit,arr[i]-min);
            }
        }
       
      return profit;
    }
}