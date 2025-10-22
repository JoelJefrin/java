import java.util.Scanner;
public class evnorod {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

        int num = scan.nextInt();

        if (num%2==0){
            System.out.println("THE NUMBER IS A EVEN NUMBER");
        }
        else{
            System.out.println("THE NUMBER IS A ODD NUMBER");
        }
    }
    }
    
}
