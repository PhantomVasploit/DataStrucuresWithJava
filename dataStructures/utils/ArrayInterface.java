package dataStructures.utils;

public interface ArrayInterface
{
    void print();
    void insert(int item);
    void removeAt(int index);
    int indexOf(int item);
    int max();
    int[] intersect(int[] otherArr);
    int[] reverse();
    void insertAt(int index, int item);
}