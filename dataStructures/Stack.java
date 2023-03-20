package dataStructures;

import java.util.Arrays;

import dataStructures.utils.StackInterface;

public class Stack implements StackInterface
{
    private int count = 0;
    private int[] items = new int[5];

    public void push(int item) throws StackOverflowError
    {
        if(count > items.length) throw new StackOverflowError("Stack is full");
        if(count <= items.length)
            items[count++] = item;
    }

    public void print()
    {
        var content = Arrays.copyOfRange(items, 0, count);
        System.out.println(Arrays.toString(content));
    }

    public int pop() throws IllegalStateException
    {
        if(count == 0) throw new IllegalStateException("Stack is empty");
        return items[--count];
    }

    public int peek() throws IllegalStateException
    {
        if(count == 0) throw new IllegalStateException("Stack is empty");
        return items[count-1];
    }
    public boolean isEmpty()
    {
        return count == 0;
    }
    public int min()
    {
        int minVal = items[count-1];
        while(count > 0)
        {
            int current = pop();
            if(current < minVal)
            {
                minVal = current;
            }
        }
        return minVal;
    }
}