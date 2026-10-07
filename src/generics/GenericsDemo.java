package generics;

import java.util.List;

public class GenericsDemo{

    public static class ResponseWrapper<T>{
        private final boolean success;
        private final T payload;
        private final long timestamp;

        public ResponseWrapper(boolean success, T payload){
            this.success = success;
            this.payload = payload;
            this.timestamp = System.currentTimeMillis();
        }

        public boolean isSuccess(){
            return success;
        }

        public T getPayload(){
            return payload;
        }

        public long getTimestamp(){
            return timestamp;
        }
    }

    public static class Pair<A, B>{
        private final A first;
        private final B second;

        public Pair(A first,B second){
            this.first = first;
            this.second = second;
        }

        public A getFirst(){
            return first;
        }

        public B getSecond(){
            return second;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== String Response ===");
        ResponseWrapper<String> StringResponse = new ResponseWrapper<>(true, "Response Success");
        System.out.println("Success: " + StringResponse.isSuccess());
        System.out.println("Payload: " + StringResponse.getPayload());
        System.out.println("Timestamp: " + StringResponse.getTimestamp());
        System.out.println();

        System.out.println("=== List Response ===");
        ResponseWrapper<List<Integer>> ListResponse = new ResponseWrapper<>(false, List.of(10, 20, 30));
        System.out.println("Success: " + ListResponse.isSuccess());
        System.out.println("Payload: " + ListResponse.getPayload());
        System.out.println("Timestamp: " + ListResponse.getTimestamp());
        System.out.println();

        System.out.println("=== Strings Pairs ===");
        Pair<String, String> StringPairs = new Pair<>("Sri", "Surya");
        System.out.println("First String: " + StringPairs.getFirst());
        System.out.println("Second String: " + StringPairs.getSecond());
        System.out.println();

        System.out.println("=== Integer Pairs ===");
        Pair<Integer, Integer> IntegerPairs = new Pair<>(10, 20);
        System.out.println("First Integer: " + IntegerPairs.getFirst());
        System.out.println("Second Integer: " + IntegerPairs.getSecond());
    }
}