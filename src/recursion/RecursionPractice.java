package recursion;

public class RecursionPractice {
    public int factorial(int n){
        if(n <= 1){ // base-case
            return 1;
        }
        return n * factorial(n - 1); // recursive-case
    }
    public int fibonacci(int n){
        if(n == 0 || n == 1){ // base-case
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive-case
    }

    public int digitSum(int n){
        if(n < 10){ // base-case
            return n;
        }
        return n % 10 + digitSum(n / 10); // recursive-case
    }
}