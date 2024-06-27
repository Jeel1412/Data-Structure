import java.util.* ;
public class Oddoreven{
    public static void main(String[]args){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       
        if(a % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}