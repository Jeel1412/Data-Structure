import java.util.*;
public class Recursion_factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n) {
        if(n == 1 || n == 0){
            return 1;
        } 
        return n*fact(n-1);
    }
}
