package useCases;

import java.util.Stack;

public class Expression
{
    private boolean isOpeningBracket(char token)
    {
        return token == '(' || token == '<' || token == '[' || token == '{';
    }

    private boolean isClosingBracket(char token)
    {
        return token == ')' || token == '>' || token == ']' || token == '}';
    }

    public boolean isBalanced(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char token: str.toCharArray())
        {
            if(isOpeningBracket(token))
            {
                stack.push(token);
            }

            if(isClosingBracket(token))
            {
                if(stack.empty()) return false;
                var top = stack.pop();
                if(
                    (token == ')' && top != '(') || 
                    (token == '>' && top != '<') ||
                    (token == ']' && top!= '[')  ||
                    (token == '}' && top != '{')
                ) return false;
            }
        }
        
        return stack.empty();
    }
}