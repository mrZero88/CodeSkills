package DataStructures.LinkedList;

public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
