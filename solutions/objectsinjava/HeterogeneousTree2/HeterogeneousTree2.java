package solutions.objectsinjava.HeterogeneousTree2;

import java.util.ArrayList;

import java.util.List;

public class HeterogeneousTree2 {

    Node root;


    /**
     * Adds the elements to the tree 
     * @param current
     * @param value
     * @param o
     * @return
     */
    private Node addRecursive(Node current, int value, Object o) {
        if (current == null) {
            return new Node(value, o);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value, o);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value, o);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    /**
     * starts the recursion from the root node:
     * @param value
     * @param o
     */
    public void add(int value, Object o) {
        root = addRecursive(root, value, o);
    }


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


    public void printElements(Node node) {
        if (node != null) {
            printElements(node.left);
            System.out.print(" " + node.value);
            printElements(node.right);
        }
    }


}


class Node {
    int value;
    Node left;
    Node right;
    List myList = new ArrayList();

    Node(int value, Object o) {

        myList.add(o);
        this.value = value;
        right = null;
        left = null;
    }
}
