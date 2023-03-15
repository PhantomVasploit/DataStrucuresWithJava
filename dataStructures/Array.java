package dataStructures;

import dataStructures.utils.ArrayInterface;


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
        String items = "[";

        for(int i =0; i<count; i++)
        {
            if(i == 0)
            {
                items += intArr[i] + ",";
            }
            else if(i == count-1)
            {
                items += " " + intArr[i];
            }else
            {
                items += " " + intArr[i] + ",";
            }
        }

        items += "]";
        System.out.println(items);
    }

    public void insert(int item)
    {
        if(count < intArr.length)
        {
            intArr[count++] = item;
        } else
        {
            int[] newArray = new int[count * 2];
            for(int i = 0; i < count; i++)
            {
                newArray[i] = intArr[i];
            }
            newArray[count++] = item;
            intArr = newArray;
        }

    }

    public void removeAt(int index) throws IllegalArgumentException
    {
        if(index < 0 || index > count) throw new IllegalArgumentException("Invalid index");
        for(; index < count; index++)
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
        for(int i = 0; i<count; i++)
        {
            if(intArr[i] == item) return i;
        }
        return -1;
    }

    public int max ()
    {
        int max = intArr[0];
        for(int i = 1; i < count; i++)
        {
            if(intArr[i] > max)
            {
                max = intArr[i];
            }
        }
        return max;
    }

    public int[] intersect(int[] otherArr)
    {
        int length = intArr.length > otherArr.length ? otherArr.length : intArr.length;
        int[] intersection = new int[length];
        int seek = 0;

        for(int element: intArr)
        {
            for(int element2: otherArr)
            {
                if(element == element2)
                {
                    intersection[seek++] = element;
                }
            }
        }



        return intersection;
    }

    public int[] reverse()
    {
        int seek = 0;
        int[] reverse = new int[count];
        for(int i = count -1; i>=0; i--)
        {
            reverse[seek] = intArr[i];
            seek++;
        }
        intArr = reverse;
        return intArr;
    }

    public void insertAt(int index, int item) throws IllegalArgumentException
    {
        if(index > count)
        {
            throw new IllegalArgumentException("Index is greater than the array length");
        }else
        {
            intArr[index] = item;
        }
    }
}