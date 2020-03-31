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


//Finish the next functions
    public void BFT() {
        Queue<Node> nodeQueue = new LinkedList<Node>();
        Node c;
        if (this.root != null)
            nodeQueue.add(this.root);
        while (!nodeQueue.isEmpty())
        {
            c = nodeQueue.remove();
            System.out.print(c.data +", ");
            if (c.leftChild != null)
                nodeQueue.add(c.leftChild);
            if (c.rightChild !=null)
                nodeQueue.add(c.rightChild);
        }


    }
    public void DFTPreOrder() {
        System.out.print("\n Preorder DFT: ");
        DFTPreOrder(this.root);
    }
    public void DFTPreOrder(Node n) {
        if (n==null)
            return;
        System.out.print(n.data+ ", ");
        DFTPreOrder(n.leftChild);
        DFTPreOrder(n.rightChild);
    }
    public void DFTInOrder() {
        System.out.print("\n Inorder DFT: ");
        DFTInOrder(this.root);
    }
    public void DFTInOrder(Node n){
        if (n==null)
            return;
        DFTInOrder(n.leftChild);
        System.out.print(n.data+ ", ");
        DFTInOrder(n.rightChild);

    }
    public void DFTPostOrder() {
        System.out.print("\n Postorder DFT: ");
        DFTPostOrder(this.root);
    }
    public void DFTPostOrder(Node n){
        if (n==null)
            return;
        DFTPostOrder(n.leftChild);
        DFTPostOrder(n.rightChild);
        System.out.print(n.data+ ", ");
    }
}
//The methods for tree traversal are in the tree Class

//This is the node class do not need to do anything here but you may make a getData method

class Node <T extends Comparable<T>> {
    public T data;
    Node leftChild=null;
    Node rightChild=null;
    Node(T d){ data=d;}
}