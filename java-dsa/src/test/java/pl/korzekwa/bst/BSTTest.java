package pl.korzekwa.bst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @Test
    void shouldHaveNullRootWhenCreated() {

        BST bst = new BST();

        assertNull(bst.root, "Newly created BST should be empty");
    }

    @Test
    void shouldSetRootOnFirstInsert() {
        BST bst = new BST();

        bst.insert(10);

        assertNotNull(bst.root, "Root should not be null after insert");
        assertEquals(10, bst.root.value, "Root value should be 10");
    }

    @Test
    void shouldInsertElementsInCorrectOrder() {
        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);

        assertEquals(10, bst.root.value, "Root should be set to 10");
        assertEquals(5, bst.root.left.value, "Left from root should be set to 5");
        assertEquals(15, bst.root.right.value, "Right from root should be set to 15");
    }

    @Test
    void shouldDeleteLeafNode() {
        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);

        bst.delete(5);

        assertNull(bst.root.left, "Left child of root should be null after deleting 5");
    }

    @Test
    void shouldDeleteNodeWithOneChild() {
        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(3);

        bst.delete(5);

        assertEquals(3, bst.root.left.value, "Node 3 should take place of deleted node 5");
    }

    @Test 
    void shouldDeleteNodeWithChildrenAndConnectTheRightOne() {
        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(10);
        bst.insert(12);
        bst.insert(20);

        bst.delete(10);

        assertEquals(12, bst.root.value, "New root should be 12");
    }

    @Test
    void shouldReturnCorrectBFSOrder() {

        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(20);

        String result = bst.bfs();

        assertEquals("10 5 15 2 7 20", result.trim(), "BFS should visit nodes level by level");
    }
}
