import java.util.*;
public class PrintDigitsOfaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int result = powerEqualsDigit(num);
        System.out.println(result);

        printDigits(num,result);
    }

    public static int powerEqualsDigit(int n) {
        int pow = 1;

        while (n != 0) {
            pow = pow * 10;
            n /= 10;
        }

        return pow / 10;
    }

    public static void printDigits(int num, int result){
        int quo = 0;
        int rem = 0;
        while(result!=0){           // My condition was while(n!=0)
            rem = num % result;
            quo = num / result;
            System.out.println(quo);
            num=rem;
            result/=10;
        }
    }

}



// Sample Input
// 65784383

// Sample Output
// 6
// 5
// 7
// 8
// 4
// 3
// 8
// 3

// import java.util.*;

// public class PrintDigitsOfaNumber {

//     public static void printDigits(int n){
//         int x = 0;
//         while(n!=0){
//             int rem = n % 10;
//             x = rem * 10 + x * 10;
//             n /= 10;
//         }
//         x = x / 10;
//         while (x!=0) {
//             int q = x % 10;
//             System.out.println(q);
//             x/=10;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
//         printDigits(n);
//     }
// }

// Method taught