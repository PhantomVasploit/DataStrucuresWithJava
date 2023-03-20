package dataStructures.utils;

public interface QueueInterface
{
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();
}
