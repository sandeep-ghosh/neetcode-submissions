

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        if (hs.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }
}