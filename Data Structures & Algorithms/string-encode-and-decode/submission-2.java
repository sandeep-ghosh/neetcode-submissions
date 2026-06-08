class Solution {
    public String encode(List<String> strs) {
        String result = "";
        for (String s : strs) {
            result = result + s.length() + '#' + s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if (str.length() == 0)
            return list;

        String newStr = str;
        while (true) {
            int l = 0;
            int r = newStr.indexOf('#');

            int length = Integer.parseInt(newStr.substring(l, r));

            String element = newStr.substring(r + 1, r + 1 + length);

            list.add(element);
            if ((r + 1 + length) >= newStr.length()) {
                break;
            } else {
                newStr = newStr.substring(r + 1 + length);
            }
        }
        return list;
    }
}
