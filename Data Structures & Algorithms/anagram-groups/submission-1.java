class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap();
        for (String s : strs) {
            int[] alpha = new int[26];
            for (char c : s.toCharArray()) {
                int index = c - 'a';
                alpha[index] += 1;
            }
            // System.out.println(Arrays.toString(alpha));
            //  use the array as a key of hashmap
            String arrstr = Arrays.toString(alpha);
            result.putIfAbsent(arrstr, new ArrayList<String>());
            result.get(arrstr).add(s);
        }

        return new ArrayList<List<String>>(result.values());
    }
}
