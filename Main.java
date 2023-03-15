import java.util.Arrays;

import dataStructures.LinkedList;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            LinkedList list = new LinkedList();
            list.addLast(10);
            list.addLast(20);
            list.addLast(30);
            list.addFirst(40);
            list.addFirst(50);
            list.addFirst(60);  
            list.removeFirst();
            list.removeLast();
            
            System.out.println(Arrays.toString(list.toArray()));
            list.reserve();
            System.out.println(Arrays.toString(list.toArray()));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}