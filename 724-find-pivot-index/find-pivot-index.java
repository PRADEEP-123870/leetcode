class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int a = 0;
        for(int num:nums){
            a+=num;
        }
        int b = 0;
        for(int i = 0;i<n;i++){
            int right = a-b-nums[i];
            if(right==b){
                return i;
            }
            b+=nums[i];
        }
        return -1;

        
    }
}