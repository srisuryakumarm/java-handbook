package modernjava;

public class PaymentStateDemo {
    public sealed interface PaymentState permits Pending, Success, Failed , Cancelled { }

    public record Pending() implements PaymentState {}
    public record Success(String transactionId) implements PaymentState {}
    public record Failed(String reason) implements PaymentState {}
    public record Cancelled() implements PaymentState {}

    static String describe(PaymentState state){
        return switch(state) {
            case Pending p -> "Payment is Pending";
            case Success s -> "Payment Successful: " + s.transactionId();
            case Failed f -> "Payment Failed: " + f.reason();
            case Cancelled c -> "Payment Cancelled";
        };
    }

    public static void main(String[] args){
        PaymentState pending = new Pending();
        PaymentState success = new Success("TX-132");
        PaymentState failed = new Failed("Insufficient Balance");
        PaymentState cancelled = new Cancelled();

        System.out.println(describe(pending));
        System.out.println(describe(success));
        System.out.println(describe(failed));
        System.out.println(describe(cancelled));
    }
}