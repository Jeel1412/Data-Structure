import java.util.* ;
public class Areacircle{
    public static void main(String[]args){
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        double a = r*r*3.14;

        System.out.println(a);
    }
}