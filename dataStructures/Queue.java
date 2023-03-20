package dataStructures;

import dataStructures.utils.QueueInterface;

public class Queue implements QueueInterface
{
    private int[] intArr;
    private int front = 0;
    private int rear = 0;
    private int count;

    public Queue(int capacity)
    {
        intArr = new int[capacity];
    }

    public void enqueue(int item) throws IllegalStateException
    {
        if(count >= intArr.length) throw new IllegalStateException();
        intArr[rear] = item;
        rear = (rear + 1) % intArr.length;
        count++;
    }

    public int dequeue()
    {
        var item = intArr[front];
        intArr[front] = 0;
        front = (front + 1) % intArr.length;
        count--;
        return item;
    }

    public int peek()
    {
        return intArr[rear];
    }

    public boolean isEmpty()
    {
        return intArr.length == 0;
    } 

    public boolean isFull()
    {
        return intArr.length == 5;
    }

    public void print()
    {
        String output = "";
    
        for(int i = 0; i< intArr.length; i++)
        {
            if(i==0)
            {
                output += "[" + intArr[i] + ", ";
            }else if(i == (intArr.length - 1))
            {
                output += intArr[i] + "]";
            }else
            {
                output += intArr[i] + ", ";
            }
        }
        System.out.println(output);
    }
}