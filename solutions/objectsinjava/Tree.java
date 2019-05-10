package solutions.objectsinjava;

public class Tree {

    Node root;

    /**
     * Adds the elements to the tree
     * @param current
     * @param value
     * @return
     */


    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    /**
     * starts the recursion from the root node:
     * @param value
     */
    public void add(int value) {
        root = addRecursive(root, value);
    }


    /**
     *
     * @param node
     */
    public void printElements(Node node) {
        if (node != null) {
            printElements(node.left);
            System.out.print(" " + node.value);
            printElements(node.right);
        }
    }


    /**
     * Check if the tree contains value
     * @param current
     * @param value
     * @return
     */
    private boolean containsInNode(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value
                ? containsInNode(current.left, value)
                : containsInNode(current.right, value);
    }


}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

