
import java.util.Scanner;
public class terop {
    public static void main(String[] args) {    //ternary operaters are shortcut methods for if else statements
        // System.out.println(true?"yes":"no");

        // String result = false?"joel":"jefrin";
        // System.out.println(result);
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter Two  Numbers that you want to Compare: ");
            int num1= scan.nextInt();
            int num2= scan.nextInt();
            String result = num1>num2?num1+" is greater":num2+" is greater";
            System.out.println(result);


        }
    }
    
}
