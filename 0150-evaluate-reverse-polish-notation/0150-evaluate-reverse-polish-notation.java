class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            String ch = tokens[i];
            if(!isOperator(ch)){
                s.push(Integer.valueOf(ch));
            }else{
                int num1 =  s.peek();
                s.pop();
                int num2 = s.peek();
                s.pop();

                if (ch.equals("+")) {
                    s.push(num1 + num2);
                } else if (ch.equals("-")) {
                    s.push(num2 - num1);
                } else if (ch.equals("*")) {
                    s.push(num1 * num2);
                } else {
                    s.push(num2 / num1);
                }
            }
        }
        return s.peek();
    }
    public boolean isOperator(String ch){
        if (ch.equals("+") || ch.equals("-") ||
            ch.equals("*") || ch.equals("/")) {
            return true;
        }
        return false;
    }
}