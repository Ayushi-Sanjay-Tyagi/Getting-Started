import java.util.*;

public class CheckJava{

    public static Scanner sc = new Scanner(System.in);
    public static void printZ(){
        System.out.println("******");
        System.out.println("    *");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("******");
    }

    public static void takeInput(){
       System.out.println("Enter Input: ");
       int n = sc.nextInt();
       System.out.println("This is ths input you entered: " + n);
    }

    public static void main(String[] args){
        System.out.println("First class");
        printZ();
        takeInput();
    }
}