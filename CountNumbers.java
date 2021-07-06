// How many digits in a given number

import java.util.*;
public class CountNumbers {
    public static int countdigits(int n){
        int count = 0;
            while(n!=0){
                n/=10;
                count++;
            }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = countdigits(n);
        System.out.println(result);
    }
}
