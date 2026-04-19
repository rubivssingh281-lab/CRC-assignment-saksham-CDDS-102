import java.util.Stack;
public class p79{
    static boolean isBalanced(String expr){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<expr.length(); i++){
            char ch=expr.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if ((ch==')' && top !='(') || (ch=='}' && top !='{') || (ch == ']' && top !='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String test1 = "({[]})";
        String test2 = "({[}])";
        System.out.println(test1+" balanced? "+isBalanced(test1));
        System.out.println(test2+" balanced? "+isBalanced(test2));
    }
}