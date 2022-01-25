class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int length = nums.length;
        int missingNum = 0;
        
        for(int i = 0; i < length; i++){
            if(nums[i] != missingNum){
                return missingNum;
            }
            missingNum++;
        }
        return missingNum;
    }
}