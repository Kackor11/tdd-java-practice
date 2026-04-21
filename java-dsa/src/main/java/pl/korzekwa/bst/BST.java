package pl.korzekwa.bst;

public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertRecursive(root, value);
        }
    }

    private void insertRecursive(Node current, int value) {

        if (value <= current.value) {
            if (current.left == null) {
                Node newNode = new Node(value);
                current.left = newNode;
            } else {
                insertRecursive(current.left, value);
            }
        } else {
            if (current.right == null) {
                Node newNode = new Node(value);
                current.right = newNode;
            } else {
                insertRecursive(current.right, value);
            }
        }
    }

    public void delete(int value) {}
}