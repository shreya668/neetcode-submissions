class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempStack = new Stack<Integer>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            while(!tempStack.isEmpty() && temperatures[tempStack.peek()] < temperatures[i]) {
                int index1 = tempStack.pop();
                result[index1] = (i-index1); 
            }

            tempStack.push(i);
        }
        while(!tempStack.isEmpty()) {
            int index1 = tempStack.pop();
            result[index1] = 0;
        }

        return result;

    }
}
