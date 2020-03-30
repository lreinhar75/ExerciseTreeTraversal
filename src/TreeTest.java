public class TreeTest{
    public static void main(String[] args) {
        Tree BST = new Tree();
        BST.insert(new Node("structure"));
        BST.insert(new Node <String>("love"));
        BST.insert(new Node <String>("binary"));
        BST.insert(new Node <String>("we"));
        BST.insert(new Node <String>("data"));
        BST.insert(new Node <String>("and"));
        BST.insert(new Node <String>("trees"));
        BST.BFT();
        BST.DFTPreOrder();
        BST.DFTInOrder();
        BST.DFTPostOrder();
    }
}
