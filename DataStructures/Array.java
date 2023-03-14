package DataStructures;

import java.util.Arrays;

interface ArrayInterface
{
    void print();
    void insert(int item);
    void removeAt(int index);
    int indexOf(int item);
}

public class Array implements ArrayInterface
{
    private int[] intArr;
    private int count = 0;

    public Array(int length)
    {
        intArr = new int[length];
    }

    public void print()
    {
        System.out.println(Arrays.toString(intArr));
    }

    public void insert(int item)
    {
        if(count < intArr.length)
        {
            intArr[count++] = item;
        } else
        {
            int[] newArray = new int[intArr.length * 2];
            for(int i = 0; i < intArr.length; i++)
            {
                newArray[i] = intArr[i];
            }
            newArray[count++] = item;
            intArr = newArray;
        }

    }

    public void removeAt(int index)
    {
        for(; index<intArr.length; index ++)
        {
            if(index == (intArr.length-1))
            {
                intArr[index] = 0;
            }else
            {
                intArr[index] = intArr[index+1];
            }
        }
    }

    public int indexOf(int item)
    {
        for(int i = 0; i<intArr.length; i++)
        {
            if(item == intArr[i])
            {
                return i;
            }
        }
        return -1;
    }
}