class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(Character c : s.toCharArray()) {
               if(c == '('  || c == '{' || c == '[' ) {
                    stack.push(c);
                    continue;
                } 
                if(stack.size() == 0) return false;
                if(c == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(c == '}' && stack.peek() == '{'){
                    stack.pop();
                } else if(c == ']' && stack.peek() == '['){
                    stack.pop();
                } else {
                   return false;
               }
            }
        return stack.isEmpty();
    }
}
