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

}
