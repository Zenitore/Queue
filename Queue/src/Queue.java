public class Queue<T> {
    private QueueNode<T> firstNode;
    private QueueNode<T> lastNode;
    private int size;


    int size(){return size;}


    T peek(){return firstNode.getValue();}
}
