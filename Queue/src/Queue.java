public class Queue<T> {
    private QueueNode<T> firstNode;
    private QueueNode<T> lastNode;
    private int size = 0;

    void enqueue(T element){
        QueueNode<T> addedNode = new QueueNode<>(element);
        if (size == 0){
            firstNode = addedNode;
        }
        else {
            lastNode.setChildNode(addedNode);
            lastNode = addedNode;
        }
        size++;
    }    //add an element

    T dequeue(){
        QueueNode<T> deletedNode = firstNode;
        firstNode = firstNode.getChildNode();
        return deletedNode.getValue();
    }                //remove and return the least recent element

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
