class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        
        // 1. Find the maximum height to determine our bucket size
        int maxHeight = 0;
        for (int h : heights) {
            if (h > maxHeight) {
                maxHeight = h;
            }
        }
        
        // 2. Create an array where the index represents the height
        String[] heightToName = new String[maxHeight + 1];
        for (int i = 0; i < n; i++) {
            heightToName[heights[i]] = names[i];
        }
        
        // 3. Collect names in descending order of heights
        String[] result = new String[n];
        int idx = 0;
        for (int i = maxHeight; i >= 0; i--) {
            if (heightToName[i] != null) {
                result[idx++] = heightToName[i];
            }
        }
        
        return result;
    }
}