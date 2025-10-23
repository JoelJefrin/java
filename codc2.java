import java.util.Scanner;
public class codc2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            // int num = scan.nextInt();

            // if(num<50){
            //     System.out.println("You Need to Imporve");

            // }
            // else if(num >=50 && num <=70){
            //         System.out.println("Good job");
            // }
            // else{
            //     System.out.println("Excellent Performence");

            int s1 = scan.nextInt();
            int s2 = scan.nextInt();
            int s3 = scan.nextInt();
            int s4 = scan.nextInt();
            int s5 = scan.nextInt();

            double total = s1+s2+s3+s4+s5;
            double avg = total/5;
            if (avg<35){
                System.out.println("your avg is: "+avg);
                System.out.println("Attend extra classes");
            }
            else{
                System.out.println("your avg is: "+avg);
                System.out.println("You are Good to go");
            }

            }

        }

    }
 
