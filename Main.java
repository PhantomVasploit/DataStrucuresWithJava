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
            integers.insert(10);
            integers.insert(21);
            integers.insert(22);
            integers.insert(24);
            integers.insert(23);
            integers.insert(25);
            integers.insert(13);
            integers.insert(72);
            integers.insert(34);
            integers.reverse();
            int[] intersection = integers.intersect(otherArr);
            System.out.println(Arrays.toString(intersection));
            integers.removeAt(0);
            integers.print();
            System.out.println(integers.indexOf(72));
            System.out.println(integers.max());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}