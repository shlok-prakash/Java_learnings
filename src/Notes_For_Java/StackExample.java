package Notes_For_Java;

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Apple");
        stack.push("Banana");
        System.out.println(stack);

        String topElement = stack.peek();
        System.out.println(topElement);

        String elementOutFromStack = stack.pop();
        System.out.println(elementOutFromStack);

        topElement = stack.peek();
        System.out.println(topElement);

        System.out.println(stack.isEmpty());

        stack.push("Banana");
        stack.push("Orange");
        stack.push("Mango");//top

        System.out.println(stack.search("Cherry"));




    }

}
