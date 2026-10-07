package generics;

import java.util.ArrayList;
import java.util.List;

public class TransactionSorting{
    public static void main(String[] args){
        List<Transaction> transaction = new ArrayList<>();

        transaction.add(new Transaction("T1", 500.50, 1003L));
        transaction.add(new Transaction("T2", 100.25, 1001L));
        transaction.add(new Transaction("T3", 750.75, 1005L));
        transaction.add(new Transaction("T4", 250.00, 1002L));

        // Sort by Amount
        transaction.sort((a1, a2) -> Double.compare(a1.getAmount(), a2.getAmount()));

        System.out.println("Sorted by Amount: ");
        transaction.forEach(System.out::println);

        System.out.println();

        // Sort by Time Stamp
        transaction.sort((t1, t2) -> Long.compare(t2.getTimestamp(), t1.getTimestamp()));

        System.out.println("Sorted by Timestamp: ");
        transaction.forEach(System.out::println);

        System.out.println();
    }
}

