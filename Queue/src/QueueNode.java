public class QueueNode<T> {
    private QueueNode<T> parentNode;
    private T value;

    public QueueNode() {          //Default constructor
        parentNode = null;
        value = null;
    }

    public QueueNode(T value) {  //Constructor for data input only
        this.value = value;
        parentNode = null;
    }

    public QueueNode(T value, QueueNode<T> parentNode) {  //Constructor for data and node input
        this.value = value;
        this.parentNode = parentNode;
    }

    //Setters and getters for the node class
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setParentNode(QueueNode<T> parentNode) {
        this.parentNode = parentNode;
    }

    public QueueNode<T> getParentNode() {
        return parentNode;
    }

    //toString and equals methods (Overrides)
    public String toString() {
        if (value == null) {
            return "Node: null";
        } else {
            return "Node: " + value.toString();
        }
    }

    public boolean equals(QueueNode<T> node) {
        return this.value.equals(node.getValue());
    }
}
