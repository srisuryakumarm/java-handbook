package generics;

public final class Transaction{
    private final String id;
    private final double amount;
    private final long timestamp;

    public Transaction(String id, double amount,long timestamp){
        this.id = id;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getId(){
        return id;
    }

    public double getAmount(){
        return amount;
    }

    public long getTimestamp(){
        return timestamp;
    }

    @Override
    public String toString(){
        return "Transaction{id='" + id + "', amount=" + amount + ", timestamp=" + timestamp + '}';
    }
}