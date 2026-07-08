class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int n=sb.length();
        for(int i=0;i<n;i++){
            char ch=sb.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90){
              ascii=ascii+32;
              ch=(char)ascii;
              sb.setCharAt(i,ch);
              
            }
            else{
                ch=(char)ascii;
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString();
        
        
    }
}