package binary_search_tree;

public class Node<T> {
    T data;

    public Node<T> left;
    public Node<T> right;

    public Node(T data){
        this.data = data;
        left = null;
        right = null;
    }

}
