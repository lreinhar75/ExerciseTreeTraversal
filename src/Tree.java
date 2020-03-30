import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node root = null;

    public void insert(Node in) {
        if (root != null)
            insert(in, root);
        else
            root = in;
    }

    public void insert(Node in, Node at) {
        if (in.data.compareTo(at.data) >= 0) {
            if (at.rightChild == null)
            {
                at.rightChild = in;
                System.out.println(in.data +" parent " +at.data +" right tree");
            }
            else
                insert(in, at.rightChild);
        }
        if (in.data.compareTo(at.data) < 0) {
            if (at.leftChild == null){
                at.leftChild = in;
                System.out.println(in.data  +" parent " +at.data +" left tree");
            }
            else
                insert(in, at.leftChild);
        }
    }



    public void BFT() {
    }


    public void DFTPreOrder() {
        System.out.print("\n Preorder DFT: ");
        DFTPreOrder(this.root);
    }
    public void DFTPreOrder(Node n)
    {
    }
    public void DFTInOrder() {
        System.out.print("\n Inorder DFT: ");
        DFTInOrder(this.root);
    }
    public void DFTInOrder(Node n){
    }
    public void DFTPostOrder() {
        System.out.print("\n Postorder DFT: ");
        DFTPostOrder(this.root);
    }
    public void DFTPostOrder(Node n){
    }
}

class Node <T extends Comparable<T>> {
    public T data;
    Node leftChild=null;
    Node rightChild=null;
    Node(T d){ data=d;}
}