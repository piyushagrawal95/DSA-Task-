class Solution {
    public String largestOddNumber(String num) {
        int max=0;
        for(int i=num.length()-1;i>=0;i--){
            int nums=num.charAt(i)-'0';
            if(nums%2==1){
                return num.substring(0,i+1);

            }

        }
        return "";
        
    }
}
