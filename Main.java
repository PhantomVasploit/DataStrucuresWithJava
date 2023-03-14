import java.util.Arrays;

import dataStructures.Array;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            Array integers = new Array(3);
            int[] otherArr = {5, 3};
            integers.insert(5);
            integers.insert(6);
            integers.insert(7);
            int [] intersection = integers.intersect(otherArr);
            System.out.println(Arrays.toString(intersection));
            integers.print();
            System.out.println(integers.max());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}