class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (counter.containsKey(i)) {
                counter.put(i, counter.get(i) + 1);
            } else {
                counter.put(i, 0);
            }
        }

        // array with frequency, number
        List<int[]> freq_num = new ArrayList<int[]>();

        for (Map.Entry<Integer, Integer> e : counter.entrySet()) {
            freq_num.add(new int[] {e.getValue(), e.getKey()});
        }

        // desc sort
        freq_num.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i=0; i < k; i++) {
            result[i] = freq_num.get(i)[1];
        }

        return result;
    }
}
