import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        System.out.println("enter the power");
        int b=sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
             ans=ans*a;
        }
        System.out.println(ans);
    }
}