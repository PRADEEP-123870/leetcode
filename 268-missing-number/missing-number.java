class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        if(l-1 == nums[l-1]){
            return l;
        }
        else{
            for(int i = 0; i<l-1; i++){
                if(nums[i] != nums[i+1]-1 ){
                    return nums[i]+1;
                }
            }
        }
        return 0;
    }
}