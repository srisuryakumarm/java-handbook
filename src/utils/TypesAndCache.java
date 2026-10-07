package utils;

public class TypesAndCache
{
    public static void main(String[] args){
        // Integer Overflow
        // Integer.MAX_VALUE is 2^31 to 2^31 - 1

        int x = Integer.MAX_VALUE;
        System.out.println(x + 1);
        // MAX_VALUE + 1 overflows to MIN_VALUE.

        int y = Integer.MIN_VALUE;
        System.out.println(y - 1);
        // MIN_VALUE - 1 overflows to MAX_VALUE.

        // Integer Cache
        Integer a = 100; // Automatically uses Integer a = Integer.valueOf(100);
        Integer b = 100;

        System.out.println(a == b); // true
        // 100 is within the cached range -128 to 127, so both point to the same Object

        Integer c = 200;
        Integer d = 200;

        System.out.println(c == d);  // false
        // 200 is outside the cached range, so these reference point to different Objects

        System.out.println(c.equals(d)); // true
        // equals() compares the values of the Object, not the references
    }
}