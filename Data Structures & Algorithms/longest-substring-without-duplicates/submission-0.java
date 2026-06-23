class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        char[] arr = s.toCharArray();
        int L = 0;
        int length = 0;
        for (int R = 0; R < arr.length; R++) {
            while (window.contains(arr[R])) {
                window.remove(arr[L]);
                L++;
            }
            length = Math.max(length, R - L + 1);
            window.add(arr[R]);
        }
        return length;
    }
}
