class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int count = 0;
        int original = x;
        while(x!=0){
            int a = x%10;
            count = count*10+ a;
            x = x/10;
        }
        return original == count;
        
    }
}