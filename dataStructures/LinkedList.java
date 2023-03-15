package dataStructures;

import java.util.NoSuchElementException;

import dataStructures.utils.LinkedListInterface;

public class LinkedList implements LinkedListInterface
{
    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count = 0;

    public void print()
    {
        var current = first;
        while(current != null)
        {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void addLast(int value)
    {
        if(first == null)
        {
            Node node = new Node(value);
            first = last = node;
            count++;
        }else
        {
            Node node = new Node(value);
            last.next = node;
            last = node;
            count++;
        }
    }

    public void addFirst(int value)
    {
        if(first == null)
        {
            Node node = new Node(value);
            first = last = node;
            count++;
        }else
        {
            Node node = new Node(value);
            node.next = first;
            first = node;
            count++;
        }

    }

    public int indexOf(int item)
    {
        var current = first;
        int index = 0;
        while(current != null)
        {
            if(current.value == item)
            {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item)
    {
        var current = first;
        while(current != null)
        {
            if(current.value == item)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void removeLast() throws NoSuchElementException
    {
        if(first == null) throw new NoSuchElementException("Linked List is empty");
        else
        {
            var secondLastNode = getPrevous(last);
            last = secondLastNode;
            last.next = null;
            count--;
        }
    }
    private Node getPrevous(Node node)
    {
        var current = first;
        while(current != null)
        {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    public void removeFirst() throws NoSuchElementException
    {
        if(first == null) throw new NoSuchElementException("Linked List is empty");
        else
        {
            var current = first;
            first = null;
            first = current.next;
            count--;
        }
    }
    public int size()
    {
        return count;
    }
    public int[] toArray()
    {
        int[] intArr = new int[count];
        var current = first;
        int i = 0;
        while(i < count && current != null)
        {
            intArr[i] = current.value;
            current = current.next;
            i++;
        }
        
        return intArr;
    }
    public void reserve()
    {
        var previous = first;
        var current = first.next;
        while(current != null)
        {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }
    
}