class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> closingB = new HashSet<>(Set.of(')', '}', ']'));
        HashSet<Character> openingB = new HashSet<>(Set.of('(', '{', '['));
        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(openingB.contains(currChar)) {
                stack.push(currChar);
            }

            if(currChar == ')') {
                if(stack.isEmpty()) return false;
                char c = stack.peek();
                if(c == '(') stack.pop();
                else return false;
            }
            if(currChar == '}') {
                if(stack.isEmpty()) return false;
                char c = stack.peek();
                if(c == '{') stack.pop();
                else return false;
            }
            if(currChar == ']') {
                if(stack.isEmpty()) return false;
                char c = stack.peek();
                if(c == '[') stack.pop();
                else return false;
            }
        }

        return stack.isEmpty();
    }
}
