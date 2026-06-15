class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == ',' || ch == '('){
                continue;
            }
            if( ch == 't' || ch == 'f' || ch == '!' || ch == '|' || ch == '&' ){
                s.push(ch);
            }else if(ch == ')'){
                boolean hasTrue = false , hasFalse = false;
                while(s.peek() != '!' && s.peek() != '|' && s.peek() != '&'){
                    char top = s.pop();
                    if(top == 'f'){
                        hasFalse = true;
                    }
                    if(top == 't'){
                        hasTrue = true;
                    }
                }
                char operator =  s.pop();
                if(operator == '!'){
                    s.push(hasTrue ? 'f' : 't');
                }else if(operator == '&'){
                    s.push(hasFalse ? 'f' : 't');
                }else{
                    s.push(hasTrue ? 't' : 'f');
                }
            }

        }
        return s.peek() == 't';
    }
}