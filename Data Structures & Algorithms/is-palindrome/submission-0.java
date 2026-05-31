class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r){

            while (!this.isAlphaNumeric(s.charAt(l)) && l < r)
                l++;

            while (!this.isAlphaNumeric(s.charAt(r)) && l < r)
                r--;

            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))){
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    boolean isAlphaNumeric(char c){
        return (c >= 'A' && c <= 'Z') || 
        (c >= 'a' && c <= 'z') ||
        (c >= '0' && c <= '9');
    }
}
