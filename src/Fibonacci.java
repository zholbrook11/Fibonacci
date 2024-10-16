import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci number calculator!");
        System.out.println("Enter the sequential value, and it's corresponding Fibonacci number will be returned.");
        int userSequenceNum = scnr.nextInt();
        int userFibNum = calculateFibonacci(userSequenceNum);
        System.out.println("The Fibonacci number at sequence position " + userSequenceNum + " is " + userFibNum + ".");

    }   

    public static int calculateFibonacci(int n){
        if (n <= 1){
            return n;
        }

        int fib = 1;
        int prevFib = 0;

        for (int i = 2; i <= n; i++){
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
