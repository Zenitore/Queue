public class Queue<T> {
    private QueueNode<T> firstNode = new QueueNode<>();
    private QueueNode<T> lastNode = new QueueNode<>();
    private int size = 0;

    void enqueue(T element){
        QueueNode<T> addedNode = new QueueNode<>(element);
        if (size == 0){
            firstNode = addedNode;
        }
        else {
            if(size == 1){
                firstNode.setChildNode(addedNode);
                lastNode = addedNode;
            }else{
                lastNode.setChildNode(addedNode);
                lastNode = addedNode;
            }
        }
        size++;
    }    //add an element

    T dequeue(){
        QueueNode<T> deletedNode = firstNode;
        if(!isEmpty()) {
            if (size == 1) {
                size--;
            } else {
                firstNode = firstNode.getChildNode();
                size--;
            }
        }
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
