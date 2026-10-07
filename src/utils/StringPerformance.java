package utils;

public class StringPerformance{
    public static void main(String[] args){

        String concat = "";
        long startConcat = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            concat += i;
        }
        long endConcat = System.nanoTime();
        long concatDuration = endConcat - startConcat;

        StringBuilder builder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            builder.append(i);
        }
        long endBuilder = System.nanoTime();
        long builderDuration = endBuilder - startBuilder;

        // Printing results converted into milliseconds
        System.out.println("String Concatenation: " + concatDuration / 1000000 + " ms");
        System.out.println("String Builder: " + builderDuration / 1000000 + " ms");
    }
}