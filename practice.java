
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        try( Scanner scan = new Scanner(System.in)){
            String name = scan.nextLine();
            int age = scan.nextInt();
            scan.nextLine();
            String address = scan.nextLine();
            System.out.println("My Name is "+ name);
            System.out.println("My Age is "+ age);
            System.out.println("My address is "+ address);


        }
        String joel = "name";
        System.out.println(joel.charAt(2));
        
    }
    
}
