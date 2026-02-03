public class MaxHeap {
    public Transaction[] heap;
    public int capacity;
    public int currentSize;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new Transaction[capacity + 1];
        this.currentSize = 0;
    }

    public void insert(Transaction transaction) {
        if (currentSize == capacity) {
            System.out.println("-1");
            return;
        }
        heap[++currentSize] = transaction;
        swim(currentSize);
    }

    public Transaction removeMax() {
        if (currentSize == 0) return null;
        Transaction max = heap[1];
        swap(1, currentSize--);
        sink(1);
        return max;
    }

    public void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    public void sink(int k) {
        while (2 * k <= currentSize) {
            int j = 2 * k;
            if (j < currentSize && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            swap(k, j);
            k = j;
        }
    }

    public boolean less(int i, int j) {
        return heap[i].tAmt < heap[j].tAmt;
    }

    public void swap(int i, int j) {
        Transaction temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public String getAllTransactions() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= currentSize; i++) {
            result.append(heap[i].toString()).append("\n");
        }
        return result.toString().trim();
    }
}
