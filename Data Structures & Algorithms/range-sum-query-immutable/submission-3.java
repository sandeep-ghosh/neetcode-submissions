class NumArray {
    private int[] prefixSum;
    public NumArray(int[] nums) {
        this.prefixSum = new int[nums.length];
        if (nums.length > 0) {
            prefixSum[0] = nums[0];
        }
        // int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int r_sum = prefixSum[right];
        int l_sum = left > 0 ? prefixSum[left - 1] : 0;
        return r_sum - l_sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */