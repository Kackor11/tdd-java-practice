package pl.korzekwa.bst;
import pl.korzekwa.queue.Queue;

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

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = deleteRecursive(current.right, value);
        } else {

            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            current.value = findSmallestValue(current.right);

            current.right = deleteRecursive(current.right, current.value);
        }
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public String bfs() {
        if (root == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        Queue<Node> queue = new Queue<>();

        queue.enqueue(root);

        while (!queue.isEmpty()) {
            Node current = queue.dequeue();

            if (current == null) continue; 

            result.append(current.value).append(" ");

            if (current.left != null) {
                queue.enqueue(current.left);
            }

            if (current.right != null) {
                queue.enqueue(current.right);
            }
        }

        return result.toString().trim();
    }
}