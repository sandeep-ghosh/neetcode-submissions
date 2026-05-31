class Solution {
    public boolean isAnagram(String s, String t) {
            if (s.length()!=t.length()){
                return false;
            } else {
                int[] al = new int[26];
                for(int i=0;i<s.length();i++) {
                    al[s.charAt(i) - 'a']++;
                    al[t.charAt(i) - 'a']--;
                }
                for (int i:al){
                    if (i!=0){
                        return false;
                    }
                }
                return true;
            }
                
    }
}

