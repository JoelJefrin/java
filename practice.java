
public class practice {
    public static void main(String[] args) {
        // try( Scanner scan = new Scanner(System.in)){
        //     String name = scan.nextLine();
        //     int age = scan.nextInt();
        //     scan.nextLine();
        //     String address = scan.nextLine();
        //     System.out.println("My Name is "+ name);
        //     System.out.println("My Age is "+ age);
        //     System.out.println("My address is "+ address);


        // }
        // String joel = "name";
        // System.out.println(joel.charAt(2));
        
        // Scanner scan = new Scanner(System.in);
        //     String RCB = scan.nextLine();
        //     if (RCB.equals("win")){
        //         System.out.println("ee sala cup namde");

        //     }
        //     else{
        //         System.out.println("we will see nxt year");
        //     }
        System.out.println("The numbers which are divisible by both 3 and 5 are: ");
        for(int i = 1;i<=100;i=i+1){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }

        
    }
    
}
