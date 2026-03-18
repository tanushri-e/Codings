class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        // Process string s
        for (char c : s.toCharArray()) {
            if (c != '#') {
                st1.push(c);
            } else if (!st1.isEmpty()) {
                st1.pop();
            }
        }

        // Process string t
        for (char c : t.toCharArray()) {
            if (c != '#') {
                st2.push(c);
            } else if (!st2.isEmpty()) {
                st2.pop();
            }
        }

        // Compare both stacks
        return st1.equals(st2);
    }
}