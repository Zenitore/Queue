public class QueueNode<T> {
    private QueueNode<T> childNode;
    private T value;

    public QueueNode() {          //Default constructor
        childNode = null;
        value = null;
    }

    public QueueNode(T value) {  //Constructor for data input only
        this.value = value;
        childNode = null;
    }

    public QueueNode(T value, QueueNode<T> childNode) {  //Constructor for data and node input
        this.value = value;
        this.childNode = childNode;
    }

    //Setters and getters for the node class
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setChildNode(QueueNode<T> childNode) {
        this.childNode = childNode;
    }

    public QueueNode<T> getChildNode() {
        return childNode;
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
