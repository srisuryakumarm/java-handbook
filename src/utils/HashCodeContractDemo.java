package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeContractDemo{
    public static void main(String[] args){
        demoConstantHashCode();
        demoBrokenContract();
        demoFixedContract();
    }

    public static void demoConstantHashCode() {
        System.out.println("=== demoConstantHashCode ===");
        Map<BadHashPoint, String> map = new HashMap<>();
        int count = 100000;

        for (int i = 0; i < count; i++) {
            map.put(new BadHashPoint(i, i), "Point: " + i);
        }

        BadHashPoint lookupKey = new BadHashPoint(50000, 50000);

        String result = map.get(lookupKey);

        System.out.println("Lookup result: " + result);
        System.out.println();
    }

    public static void demoBrokenContract(){
        System.out.println("=== demoBrokenContract ===");
        Map<BrokenContractPoint, String> map = new HashMap<>();

        BrokenContractPoint storedPoint = new BrokenContractPoint(10, 20);
        BrokenContractPoint equalPoint = new BrokenContractPoint(10, 20);

        System.out.println("equals() result: " + storedPoint.equals(equalPoint));

        System.out.println("storedPoint hashCode: " + storedPoint.hashCode());

        System.out.println("equalPoint hashCode: " + equalPoint.hashCode());

        map.put(storedPoint, "Found");

        String result = map.get(equalPoint);

        System.out.println("Lookup result before fixing: " + result);
        System.out.println();
    }

    public static void demoFixedContract(){
        System.out.println("=== demoFixedContract ====");

        Map<FixedContractPoint, String> map = new HashMap<>();

        FixedContractPoint storedPoint = new FixedContractPoint(10, 20);
        FixedContractPoint equalPoint = new FixedContractPoint(10, 20);

        System.out.println("equals() result: " + storedPoint.equals(equalPoint));

        System.out.println("storedPoint hashCode: " + storedPoint.hashCode());

        System.out.println("equalPoint hashCode: " + equalPoint.hashCode());

        map.put(storedPoint, "Found");

        String result = map.get(equalPoint);

        System.out.println("Lookup result after fixing: " + result);
        System.out.println();
    }

    // BadHashPoint - terrible hashCode().
    public static final class BadHashPoint{
        private final int x;
        private final int y;

        public BadHashPoint(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj){
            if(obj == this){
                return true;
            }

            if(!(obj instanceof BadHashPoint other)){
                return false;
            }

            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode(){
            return 0;
        }
    }

    // Broken Contract
    public static final class BrokenContractPoint{
        private final int x;
        private final int y;

        public BrokenContractPoint(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj){
            if(obj == this){
                return true;
            }

            if(!(obj instanceof BrokenContractPoint other)){
                return false;
            }

            return x == other.x && y == other.y;
        }

        // No hashCode() override.
    }

    // Fixed Contract
    public static final class FixedContractPoint{
        private final int x;
        private final int y;

        public FixedContractPoint(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj){
            if(obj == this){
                return true;
            }

            if(!(obj instanceof FixedContractPoint other)){
                return false;
            }

            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode(){
            return Objects.hash(x, y);
        }
    }
}