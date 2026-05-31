class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i=0 ; i<nums.length; i++) {
            int j = target - nums[i];

            if (hmap.containsKey(j)) {
                int j_index = hmap.get(j);
                // j_index will be always smaller than i                
                
                return new int[]{j_index, i};
               
                
            } else {
                hmap.put(nums[i],i);
            }
        }

      return null; 
    }
}
