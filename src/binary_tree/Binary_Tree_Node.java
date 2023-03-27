package binary_tree;

public class Binary_Tree_Node<T> {
    public T data;
    public  Binary_Tree_Node<T> left;
    public Binary_Tree_Node<T> right;

    public Binary_Tree_Node(T data){
        this.data = data;
        left = null;
        right = null;

    }



}
