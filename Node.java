public class Node {
    String date;
    Node nextHash;
    Node prevHash;
    MaxHeap root;
    int tNumCounter;

    public Node(String date, int capacity) {
        this.date = date;
        this.root = new MaxHeap(capacity);
        this.tNumCounter = 1;
    }

    public int getNextTransactionNumber() {
        return tNumCounter++;
    }

    @Override
    public String toString() {
        return this.date;
    }
}
