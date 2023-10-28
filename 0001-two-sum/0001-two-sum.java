class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       int n = nums.length;
       for(int i=0; i<n;i++){
           int remaining = target - nums[i];
           if(map.containsKey(remaining)){
               return new int[]{map.get(remaining), i};
           }else{
               map.put(nums[i],i);
           }
       }
       return new int[]{}; // no solution
    }
}