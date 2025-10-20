import java.util.Scanner;

public class input {
    public static void main(String[] args) {
       try( Scanner joel =new Scanner(System.in)){
        int a = joel.nextInt();
        int b = joel.nextInt();
           joel.nextLine();
        String hi = joel.nextLine();
        System.out.println("You sum: " +( a + b));
        System.out.println("Thnak you : "+ hi);
       }
    }
    
}
