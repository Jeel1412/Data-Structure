import java.util.* ;
public class Vowel{
    public static void main(String[]args){
        System.out.println("Enter Character");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
       
        if(a =='a' || a =='e' || a =='i' || a =='o' || a =='u'){
            System.out.println("Character is Vowel");
        }
        else{
            System.out.println("Character is Consonant");
        }
    }
}