class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n1=names.length;
        for(int i=0;i<n1;i++){
            for(int  j=i+1;j<n1;j++){
                if(heights[i]<heights[j])
                {
                    int temp1 = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp1;

                    String temps = names[i];
                        names[i] = names[j];
                        names[j] = temps;

                }

            }
        }
        return names;
        
    }
}