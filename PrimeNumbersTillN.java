import java.util.*;
public class PrimeNumbersTillN{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range : ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        primeNumbers(low,high);
    }

    public static void primeNumbers(int low, int high){
        for(int i = low; i<=high; i++){
            boolean flag = false;
            for(int j = 2; j*j <= i; j++){
                if(i%j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }
}