public class Transaction {
    double tAmt;
    int tNum;

    public Transaction(double tAmt, int tNum) {
        this.tAmt = tAmt;
        this.tNum = tNum;
    }

    @Override
    public String toString() {
        return tAmt + " " + tNum;
    }
}
