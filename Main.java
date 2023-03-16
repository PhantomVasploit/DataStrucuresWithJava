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
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}