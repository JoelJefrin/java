import java.util.Scanner;

public class codchallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            // int income = scan.nextInt();
            // if (income>=7000){
            //     System.out.println("Scholership Available");

            // }
            // else{
            //     System.out.println("Scholership not available");
            // }
            int num = scan.nextInt();
            if(num%3==0 && num % 5==0){
                System.out.println("The Number is Divisible by 3 and 5");

            }
            else {
                System.out.println("The Number is Not Divisible by 3 and 5");
            }

    }
    
}
