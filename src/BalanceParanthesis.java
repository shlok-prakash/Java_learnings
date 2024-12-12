import java.util.Stack;
public class BalanceParanthesis {
    public static void main(String[] args) {
        String input = "()";
        System.out.print("The Parenthesis are balanced : " + checkParanthesis(input));
    }

    private static boolean checkParanthesis(String input) {
        char[] inputArray = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (char current : inputArray) {
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else {
                if (current == ')' || current == '}' || current == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char pop = stack.pop();
                        if (pop != '(') {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
