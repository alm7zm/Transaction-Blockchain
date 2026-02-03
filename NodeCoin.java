public class NodeCoin {
    Node head;
    Node tail;
    int size;

    public NodeCoin() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(String date, double tAmt, int capacity) {
        Node node = findNode(date);
        if (node == null) {
            node = new Node(date, capacity);
            addNode(node);
        }
        node.root.insert(new Transaction(tAmt, node.getNextTransactionNumber()));
    }

    public String getMax(String date) {
        Node node = findNode(date);
        if (node == null || node.root.isEmpty()) return "-1";
        return node.root.removeMax().toString();
    }

    public String getAll(String date) {
        Node node = findNode(date);
        if (node == null) return "-1";
        String result = node.root.getAllTransactions();
        removeNode(node);
        return result;
    }

    public Node findNode(String date) {
        String formattedDate = formatDate(date);
        Node current = head;
        while (current != null) {
            if (current.date.equals(formattedDate)) return current;
            current = current.nextHash;
        }
        return null;
    }

    private String formatDate(String date) {
        return String.format("%08d", Integer.parseInt(date));
    }

    public void addNode(Node node) {
        if (head == null) {
            head = tail = node;
        } else {
            tail.nextHash = node;
            node.prevHash = tail;
            tail = node;
        }
        size++;
    }

    public void removeNode(Node node) {
        if (node.prevHash != null) {
            node.prevHash.nextHash = node.nextHash;
        } else {
            head = node.nextHash;
        }
        if (node.nextHash != null) {
            node.nextHash.prevHash = node.prevHash;
        } else {
            tail = node.prevHash;
        }
        size--;
    }
}
