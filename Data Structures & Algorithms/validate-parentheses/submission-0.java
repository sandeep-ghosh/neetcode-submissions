class Solution {
    public boolean isValid(String s) {
        Deque<Character> q = new ArrayDeque<Character>();
        for (char c:s.toCharArray()) {
            
            if (c=='(' || c=='{' || c=='[') {
                //opening bracket
                q.push(c);
            } else if (c==')' || c=='}' || c==']') {
                //closing bracket
                if (q.isEmpty())
                    return false;
                
                char top = (char) q.pop();
                if (c==')' && top!='(')
                    return false;
                else if (c=='}' && top!='{')
                    return false;
                else if (c==']' && top!='[')
                    return false;
            }
        }

        return q.isEmpty();
    }
}
