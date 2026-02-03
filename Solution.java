import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NodeCoin blockchain = new NodeCoin();

        while (scanner.hasNext()) {
            int command = scanner.nextInt();
            if (command < 1 || command > 4) {
                System.out.println("-1");
                if (scanner.hasNextLine()) scanner.nextLine();  
                continue;
            }

            String date = scanner.next();
            switch (command) {
                case 1:
                    double tAmt = scanner.nextDouble();
                    blockchain.insert(date, tAmt, 100);
                    break;
                case 2:
                    System.out.println(blockchain.getMax(date));
                    break;
                case 3:
                    blockchain.getMax(date);  
                    break;
                case 4:
                    System.out.println(blockchain.getAll(date));
                    break;
            }
        }
        scanner.close();
    }
}
