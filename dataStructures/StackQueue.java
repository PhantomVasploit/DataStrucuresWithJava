package dataStructures;

import java.util.EmptyStackException;

import dataStructures.utils.QueueInterface;

public class StackQueue implements QueueInterface
{
    private Stack stack = new Stack();
    private Stack queue = new Stack();

    public void enqueue(int item)
    {
        stack.push(item);
    }

    public int dequeue() throws EmptyStackException
    {
        if(queue.isEmpty())
            if (isEmpty())
                throw new EmptyStackException();
            else
                while(!stack.isEmpty())
                    queue.push(stack.pop());
                        
        return queue.pop();
    
    }

    public int peek ()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty() && stack.isEmpty();
    }
}