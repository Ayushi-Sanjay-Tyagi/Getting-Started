import java.util.*;
public class GCDAndLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b)
            gcdAndLcm(a,b);
        else
            gcdAndLcm(b,a);
       
    }

    public static void gcdAndLcm(int a, int b){
        int divi = a;
        int div = b;

        int rem = 1;
        int lcm = 0;
        int gcd = 0;

        while(rem>0){
            rem = divi % div;
            divi = div;
            div = rem;
        }

        gcd = divi;
        System.out.println("GCD = "+ gcd);

        lcm = (a * b) / gcd;
        System.out.println("LCM = "+ lcm);

    }

}
