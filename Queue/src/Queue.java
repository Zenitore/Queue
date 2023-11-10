public class Queue<T> {
    private QueueNode<T> firstNode;
    private QueueNode<T> lastNode;
    private int size;

    boolean isEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    int size(){return size;}


    T peek(){return firstNode.getValue();}
}
