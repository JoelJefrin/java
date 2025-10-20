
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        try (Scanner scan =new Scanner(System.in)){
       
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
    

        if(num1==num2)
        {
            System.out.println("both the numbers are equal");
        }
        else
        {
            System.out.println("The numbers are not Equal");
        }

    }
}
    
}
