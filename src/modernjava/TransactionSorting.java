package modernjava;

import generics.Transaction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransactionSorting{
    public static void main(String[] args){
        List<Transaction> transaction = new ArrayList<>();

        transaction.add(new Transaction("T1", 500.50, 1003L));
        transaction.add(new Transaction("T1", 500.50, 1003L));
        transaction.add(new Transaction("T2", 100.25, 1001L));
        transaction.add(new Transaction("T3", 750.75, 1005L));
        transaction.add(new Transaction("T4", 250.00, 1002L));
        transaction.add(new Transaction("T5", 250.00, 1004L));

        // 1. Anonymous Inner Class
        List<Transaction> anonymousTransactionList = new ArrayList<>(transaction);
        anonymousTransactionList.sort(new Comparator<Transaction>(){
            @Override
            public int compare(Transaction t1, Transaction t2){
                int amountResult = Double.compare(t1.getAmount(), t2.getAmount());
                if(amountResult != 0){
                    return amountResult;
                }
                return Long.compare(t1.getTimeStamp(), t2.getTimeStamp());
            }
        });

        // 2. Lambda
        List<Transaction> lambdaTransactionList = new ArrayList<>(transaction);
        lambdaTransactionList.sort((t1, t2) -> {
            int amountResult = Double.compare(t1.getAmount(), t2.getAmount());
            if(amountResult != 0){
                return amountResult;
            }
            return Long.compare(t1.getTimeStamp(), t2.getTimeStamp());
        });

        // 3. Method Reference
        List<Transaction> methodReferenceTransactionList = new ArrayList<>(transaction);
        methodReferenceTransactionList.sort(Comparator.comparing(Transaction::getAmount).thenComparing(Transaction::getTimeStamp));

        System.out.println("Anonymous Inner Class: " + anonymousTransactionList);
        System.out.println("Lambda: " + lambdaTransactionList);
        System.out.println("Method Reference: " + methodReferenceTransactionList);
    }
}