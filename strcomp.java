public class strcomp {
    public static void main(String[] args) {
        String f1 = new String("apple");
        String f2 = new String("apple");

        String a1 = "orange";
        String a2 = "orange";

        System.out.println(f1==f2);
        System.out.println(f1.equals(f2));  //use always this .equals() for strings
        System.out.println(a1==a2);
    }
}
