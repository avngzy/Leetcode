class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
            
        }
        
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i]) && hm.get(target-nums[i]) != i){
                ans[0] = i;
                ans[1] = hm.get(target-nums[i]);
            }
        }
        return ans;
    }
}