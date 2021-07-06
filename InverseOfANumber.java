import java.util.*;
  
  public class InverseOfANumber{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int n = scn.nextInt();

       int result = inverse(n);
       System.out.println(result);

  }

  public static int inverse(int n){

    int op = 1;
    int od = 0;
    int ip = 0;
    int id = 0;
    int inv = 0;
    
    while(n != 0){
        od = n % 10;

        id = op;
        ip = od;

        inv = inv + id * (int)Math.pow(10, ip - 1);
        n/=10;
        op++;
    }

    return inv; 
  }

   
   
  }