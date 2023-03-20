import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import useCases.Expression;
import useCases.ReverseString;

public class Main
{
    public static void main(String args[])
    {
        try
        {

            Expression expression = new Expression();
            String exp = "(({1+2}))";
            System.out.println(expression.isBalanced(exp));
            ReverseString reverser = str ->
            {
                String reversed = "";
                Stack<Character> stack = new Stack<>();
                for(char ch: str.toCharArray()) stack.push(ch);
                while(!stack.empty()) reversed += stack.pop();
                return reversed;
            };
            System.out.println(reverser.reverse("Phantom"));
            dataStructures.Stack stack = new dataStructures.Stack();
            stack.push(1);
            stack.push(2);
            stack.push(-1);
            stack.push(4);
            System.out.println(stack.min());
            // reversing a queue
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(10);
            queue.add(20);
            queue.add(30);
            System.out.println(queue);
            reverse(queue);
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void reverse(Queue<Integer> queue)
    {
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty())
        {
            var front = queue.remove();
            stack.push(front);
        }

        while(!stack.empty()) queue.add(stack.pop());
        System.out.println(queue);
    }
}