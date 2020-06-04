class Solution {
    public void reverseString(char[] s) 
    {
        reverseString(s,0,s.length-1);
    }
    public void reverseString(char[] s,int start,int end)
    {
        if(start>end)
        {
            return;
        }
        char ch = s[start];
        s[start]=s[end];
        s[end]=ch;
        reverseString(s,start+1,end-1);
        
    }
}