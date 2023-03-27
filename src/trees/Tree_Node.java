package trees;

import java.util.ArrayList;

public class Tree_Node<T> {
    public T data;
    public ArrayList<Tree_Node<T>> children;


    public Tree_Node(T data){
        this.data=data;

        children=new ArrayList<>();
    }

}
