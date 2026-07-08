class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        char[] arr = word.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                count++;
            }
        }
        
        if (count == n || count == 0 || (count == 1 && (arr[0] >= 'A' && arr[0] <= 'Z'))) {
            return true;
        } else {
            return false;
        }
    }
}