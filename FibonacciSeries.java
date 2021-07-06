import java.util.*;

public class FibonacciSeries {
    
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
    }

    public static void printFibonacci(int n){
        int first = 0;
        int second = 1;
        int count = 0;
        int third = 0;

        while(count < n){
            System.out.print(first  + " ");
            third = first + second;
            first = second;
            second = third;
            count++;
        }
    }
}
