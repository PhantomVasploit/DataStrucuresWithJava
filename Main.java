import java.util.Arrays;

import DataStructures.Array;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            Array integers = new Array(3);
            int[] otherArr = {5, 3, 2};
            integers.insert(1);
            integers.insert(2);
            integers.insert(3);
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