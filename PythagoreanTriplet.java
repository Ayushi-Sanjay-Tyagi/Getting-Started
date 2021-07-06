import java.util.Scanner;
public class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean result = pythagoreanTriplet(a,b,c);
        System.out.println(result);

    }

    public static boolean pythagoreanTriplet(int a,int b,int c){

        if(a>b && a>c){
            if((a*a) == (b*b) + (c*c)){
                return true;
            }
        }
        else if(b>a && b>c){
            if( (b*b) == (a*a) + (c*c)){
                return true;
            }
        }
        else{
            if( (c*c) == (a*a) + (b*b)){
                return true;
            }
        }
            return false;
    }
}
