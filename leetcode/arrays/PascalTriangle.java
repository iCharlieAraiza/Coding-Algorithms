class Solution {
    public int triangularSum(int[] nums) {     
        if(nums.length < 2) {
            return nums[0];
        }
        int i = 0;
        int j = i + 1;
        int count = nums.length - 1;
    
        while(count >= 1){
            while(j <= count) {
                nums[i] = (nums[i]+ nums[j]) % 10;
                i++;
                j++;
            }
            i = 0;
            j = 1;
            count--;
        }
        
        return nums[0];
    }
}
