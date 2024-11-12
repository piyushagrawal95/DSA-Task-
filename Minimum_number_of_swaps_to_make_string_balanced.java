class Solution {
    public int minSwaps(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()||st.peek()==']'){
                    st.push(ch);
                }
                else{
                    st.pop();
                }
            }

        }
        int res=st.size();
        int ans=res/2;
        return (ans+1)/2;
        
    }
}
