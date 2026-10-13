class Solution {
    public String largestOddNumber(String num) {
        int size=num.length();
        String ans="";
        for(int i=size-1;i>=0;i--)
        {
            int a=num.charAt(i)-'0';
            if(a%2!=0)
            {
                return num.substring(0,i+1);
            }
        }
        return ans;
    }
}