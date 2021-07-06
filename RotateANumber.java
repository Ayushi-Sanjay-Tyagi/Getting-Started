import java.util.*;

public class RotateANumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = sc.nextInt();
        int result = rotate(n,r);
        System.out.println(result);
    }

    public static int countDigits(int n){
        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }

    public static int rotate(int n, int r){
        int digits = countDigits(n);
        r = r % digits;
        if(r<0){
            r+=digits;
        }

        int mul = 1;
        int div = 1;

        for(int j = 1; j<= digits ; j++){
            if(j<=r){
                div*=10;
            }
            else{
                mul*=10;
                System.out.println(mul);
            }
        }

        int b = n % div;
        int a = n / div;
 
        return (b * mul + a);
    }
}




// import java.util.*;

// public class RotateANumber {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         System.out.println("Enter value of r: ");
//         int r = sc.nextInt();

//         int result = power(n);
//         System.out.println(result);

//         rotate(n,result,r);
//     }

//     public static int power(int n){
//         int pow = 1;
//         while(n!=0){
//             pow *=10;
//             n/=10;
//         }
//         return pow/10;
//     }

//     public static void rotate(int n, int result, int r){
//         int q = 0;
//         int rem = 0;
//         if(r>0){
//             while(r!=0){
//                 rem = n % 10;
//                 q=n/10;
//                 n = rem * result + q;
//                 r--;
//             }
//             System.out.println(n);
//         }
//         else if(r<0){
//             while(r!=0){
//                 rem = n % result;
//                 n = n / result;
//                 n = rem * 10 + n;
//                 r++;
//             }
//             System.out.println(n);
//         }
//         else{
//             System.out.println(n);
//         }
//     }
// }




