/**
 * Buggy code class for use in Debugging activity
 */
public class Item {
    String name;
    int key;

    public Item (String name, int key) {
        this.name = name;
        this.key = key;
    }

    public String toString() {
        return name + " : " + key;
    }
}
