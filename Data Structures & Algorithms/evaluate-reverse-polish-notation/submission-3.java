class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> evaluateExp = new Stack<>();

        for(String curr : tokens) {
            //System.out.println("current "+curr);

            if("+-*/".contains(curr)) {
                if(curr.equals("+")) {
                    evaluateExp.push(evaluateExp.pop() + evaluateExp.pop());
                }

                if(curr.equals("-")) {
                    int a = evaluateExp.pop();
                    int b = evaluateExp.pop();
                    evaluateExp.push(b - a);
                }

                if(curr.equals("*")) {
                    evaluateExp.push(evaluateExp.pop() * evaluateExp.pop());
                }

                if(curr.equals("/")) {
                    int a = evaluateExp.pop();
                    int b = evaluateExp.pop();
                    evaluateExp.push(b / a);
                }
            } else {
                evaluateExp.push(Integer.parseInt(curr));
            }
             
        }

        return evaluateExp.pop();
    }
}
