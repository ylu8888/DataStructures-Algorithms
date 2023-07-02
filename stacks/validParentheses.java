class validParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        //Push open parentheses onto stack, pop if is an outer paren, check if the stack is empty at the end 
        
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(!stack.isEmpty() && c == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if(!stack.isEmpty() && c == ')' && stack.peek() == '('){
                stack.pop();
            }
            else if(!stack.isEmpty() && c == ']' && stack.peek() == '['){
                stack.pop();
            }
            else{
                return false;
            }
            

            
        }

        return stack.isEmpty();
    }
}
