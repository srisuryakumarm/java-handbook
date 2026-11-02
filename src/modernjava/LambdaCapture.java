package modernjava;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaCapture{
    public static void main(String[] args){
        List<String> list = List.of("Lambda", "Functional Interface", "Method References");
        AtomicInteger atomicCounter = new AtomicInteger(0);
        list.forEach(l -> atomicCounter.incrementAndGet());
        System.out.println("Count using Atomic Integer: " + atomicCounter);

        int count = 0;
        for(String l : list){
            count++;
        }
        System.out.println("Count using For: " + count);
    }
}