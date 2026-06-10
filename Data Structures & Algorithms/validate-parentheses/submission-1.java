class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(!closeToOpen.containsKey(currChar)) {
                stack.push(currChar);
            } else {
                if(stack.isEmpty()) return false;
                char c = stack.peek();
                if(c == closeToOpen.get(currChar)) stack.pop();
                else return false;
            }
        }

        return stack.isEmpty();
    }
}
