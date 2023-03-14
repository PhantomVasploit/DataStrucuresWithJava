package dataStructures;

import javax.lang.model.element.Element;

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

        for(int i =0; i<intArr.length; i++)
        {
            if(i == 0)
            {
                items += intArr[i] + ",";
            }
            else if(i == intArr.length-1)
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

    public int max ()
    {
        int max = 0;
        for(int i = 0; i < intArr.length; i++)
        {
            if(i != 0)
            {
                max = intArr[i] >= intArr[i-1] ? intArr[i] : intArr[i-1];
            }
        }
        return max;
    }

    public int[] intersect(int[] otherArr)
    {
        int length = intArr.length > otherArr.length ? otherArr.length : intArr.length;
        int[] intersection = new int[length];
        
        for(int i = 0; i < intArr.length; i++)
        {
            for(int j = 0; j < otherArr.length; j++)
            {
                if(intArr[i] == otherArr[j])
                {
                    intersection[i] = intArr[i];
                }
            }
        }

        return intersection;
    }

    public int[] reverse()
    {
        int seek = 0;
        int[] reverse = new int[intArr.length];
        for(int i = intArr.length -1; i>=0; i--)
        {
            reverse[seek] = intArr[i];
            seek++;
        }
        intArr = reverse;
        return intArr;
    }

    public void insertAt(int index, int item) throws IllegalArgumentException
    {
        if(index > intArr.length)
        {
            throw new IllegalArgumentException("Index is greater than the array length");
        }else
        {
            intArr[index] = item;
        }
    }
}