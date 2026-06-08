class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if (str.length() == 0)
            return list;
        int i = 0;
        while (i < str.length()) {
            int r = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, r));
            list.add(str.substring(r + 1, r + 1 + length));
            i = r + 1 + length;
        }
        return list;
    }
}
