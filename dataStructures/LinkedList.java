package dataStructures;

import dataStructures.utils.LinkedListInterface;

public class LinkedList implements LinkedListInterface
{
    private class Node
    {
        private int value;
        private Node next;
    }

    private Node first;
    private Node last;


}