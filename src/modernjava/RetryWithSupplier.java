package modernjava;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class RetryWithSupplier{
    public static void main(String[] args){
        AtomicInteger attempts = new AtomicInteger(0);
        String result = retry(3, () -> {
            int currentAttempt = attempts.incrementAndGet();
            System.out.println("Attempt: " + currentAttempt);
            if(currentAttempt < 3){
                throw new IllegalStateException("Service Unavailable");
            }
            return "Success";
        });
        System.out.println(result);
    }
    public static <T> T retry(int times, Supplier<T> action){
        if(times <= 0){
            throw new IllegalArgumentException("times must be greater than zero");
        }
        RuntimeException lastException = null;
        for(int attempt = 1; attempt <= times; attempt++){
            try{
                return action.get();
            }catch(RuntimeException e){
                lastException = e;
            }
        }
        throw lastException;
    }
}