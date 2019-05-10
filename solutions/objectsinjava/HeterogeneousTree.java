package solutions.objectsinjava;

public class HeterogeneousTree {

    HNode root;


    /**
     * adds different type of Object to the Tree
     *
     * @param usedObject
     */
    private void add(HNode usedObject)

    {
        while (true) {
            if (root == null) {
                root = usedObject;
                break;
            }
            if (root.value < usedObject.value) {
                root.right = new HNode(usedObject, usedObject.value);
                break;

            }

            if (root.value > usedObject.value) {
                root.left = new HNode(usedObject, usedObject.value);
                break;

            }
        }

    }


}

class HNode {
    int value;
    HNode left;
    HNode right;
    public Object reference;


    public HNode(Object obj, int input) {
        this.reference = obj;
        this.value = input;
        right = null;
        left = null;
    }
}
