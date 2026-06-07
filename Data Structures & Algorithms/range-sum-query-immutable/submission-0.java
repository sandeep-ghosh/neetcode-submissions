class NumArray {
    private List<Integer> prefixSum;
    public NumArray(int[] nums) {
        this.prefixSum = new ArrayList<>();
        int sum = 0;
        for (int i : nums) {
            prefixSum.add(sum + i);
            sum += i;
        }
    }

    public int sumRange(int left, int right) {
        int r_sum = prefixSum.get(right);
        int l_sum = left > 0 ? prefixSum.get(left - 1) : 0;
        return r_sum - l_sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */