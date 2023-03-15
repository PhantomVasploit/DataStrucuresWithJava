package dataStructures.utils;


public interface LinkedListInterface
{
    void addLast(int value);
    void addFirst(int value);
    int indexOf(int item);
    boolean contains (int item);
    void removeLast();
    void removeFirst();
    int size();
    int[] toArray();
    void reserve();
    void print();
}