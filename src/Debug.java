/**
 * Buggy code for use in Debugging activity
 */
public class Debug {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("bill", 3);
        items[1] = new Item("neil", 4);
        items[2] = new Item("john", 2);
        items[3] = new Item("rick", 5);
        items[4] = new Item("alex", 1);

        System.out.println("Before:");
        printItems(items, 5);

        sortItems(items, 5);

        System.out.println("After:");
        printItems(items, 5);
    }

    private static void printItems(Item[] items, int count) {
        for (int i = 0;i < count;i++) {
            System.out.println(items[i].toString());
        }
    }

    private static void sortItems(Item[] items, int count) {
        int i = 0, j = 0;
        int s = 1;
        Item t;

        for(; i < count && s != 0; i++) {
            s = 0;
            for(j = 0; j < count; j++) {
                if(items[j].key > items[j+1].key) {
                    t = items[j];
                    items[j] = items[j+1];
                    items[j+1] = t;
                    s++;
                }
            }
            count--;
        }

    }
}
